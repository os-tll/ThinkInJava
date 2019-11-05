package CheckWorkRecord;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class HttpClient {
    /**当前日期*/
    static LocalDate TODAY;
    /**上一个工作日*/
    static LocalDate YESTODAY;
    /**用于保证在一天内只判断一次*/
    static boolean FLAG_OF_SEND = true;
    /**标识是否需要通知*/
    static AtomicBoolean FLAG = new AtomicBoolean(false);

    public static void main(String[] args) {
        HttpClient httpClient = new HttpClient();

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                int hour = LocalDateTime.now().getHour();
                //只在11~12之间时进行判断
                if (hour >= 11 && hour <= 12 && FLAG_OF_SEND) {
//                if (hour > 1 && hour < 24 && FLAG_OF_SEND) {
                    httpClient.setDay();
                    httpClient.doPost("https://api.huoban.com/v2/item/table/2100000011334888/view/3500000019550854/filter", null);
                    if (!FLAG.get()) {
                        httpClient.doGet("https://sc.ftqq.com/SCU45856Tf8269b3c9367bf9da36dbdf79bebcb125c7fc1b5bb0ef.send?text=录入工时了！！！&desp=工时提醒"+LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd--HH:mm:ss")));
                        System.out.println("------>Not Have");
                    }
                    FLAG_OF_SEND = false;
                    FLAG.set(false);
                }
//                if(hour >= 1 || hour <= 24){
                if(hour >= 12 && hour <= 10){
                    FLAG_OF_SEND = true;
                    //睡眠一小时，防止频繁造成资源浪费
                    try {
//                        Thread.sleep(3*1000L);
                        Thread.sleep(60*60*1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
//        }, 1000L, 10 * 1000L);
        }, 60 * 1000L, 5 * 60 * 1000L);

    }

    /**
     * 前一个工作日初始化
     */
    public void setDay() {
        TODAY = LocalDate.now();
        YESTODAY = TODAY;
        do {
            YESTODAY = YESTODAY.plusDays(-1);

        } while (isHolidayOrWeekend(YESTODAY));
    }

    /**
     * 非工作日 true 工作日false
     */
    public boolean isHolidayOrWeekend(LocalDate date) {
        String s = doGet("http://timor.tech/api/holiday/info/" + date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        JsonRootBean2 jsonRootBean = JSONObject.parseObject(s, JsonRootBean2.class);
        //返回null,说明不是holiday
        if (Objects.isNull(jsonRootBean.getHoliday())) {
            return false;
        }
        //TODO:周六调休周日休息未考虑
        return true;
    }

    public String doGet(String url) {
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
        String result = "";
        try {
            // 通过址默认配置创建一个httpClient实例
            httpClient = HttpClients.createDefault();
            // 创建httpGet远程连接实例
            HttpGet httpGet = new HttpGet(url);
            // 设置请求头信息，鉴权
            httpGet.setHeader("Authorization", "Bearer IsmRvM8535G25pCLddQwPrnBTjp8yZnW7VHLJ5rA001");
            httpGet.setHeader("Origin", "https://app.huoban.com");
            httpGet.setHeader("Referer", "https://app.huoban.com/tables/2100000011334888");
            httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");
            httpGet.setHeader("X-Huoban-Monitor-Tag", "item_list");
            // 设置配置请求参数
            RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(35000)// 连接主机服务超时时间
                    .setConnectionRequestTimeout(35000)// 请求超时时间
                    .setSocketTimeout(60000)
                    // 数据读取超时时间
                    .build();
            // 为httpGet实例设置配置
            httpGet.setConfig(requestConfig);
            // 执行get请求得到返回对象
            response = httpClient.execute(httpGet);
            // 通过返回对象获取返回数据
            HttpEntity entity = response.getEntity();
            // 通过EntityUtils中的toString方法将结果转换为字符串
            result = EntityUtils.toString(entity);
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            if (null != response) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != httpClient) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

    public String doPost(String url, Map<String, Object> paramMap) {
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse httpResponse = null;
        String result = "";
        // 创建httpClient实例
        httpClient = HttpClients.createDefault();
        // 创建httpPost远程连接实例
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Authorization", "Bearer IsmRvM8535G25pCLddQwPrnBTjp8yZnW7VHLJ5rA001");
        httpPost.setHeader("Origin", "https://app.huoban.com");
        httpPost.setHeader("Referer", "https://app.huoban.com/tables/2100000011334888");
        httpPost.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");
        httpPost.setHeader("X-Huoban-Monitor-Tag", "item_list");
        httpPost.setHeader("X-Huoban-Return-Fields", "[\"filtered\", \"total\", {\"items\":[[\"*\", {\"updated_by\": [\"user_id\", \"name\"]}]]}]");

        // 配置请求参数实例
        RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(35000)// 设置连接主机服务超时时间
                .setConnectionRequestTimeout(35000)// 设置连接请求超时时间
                .setSocketTimeout(60000)// 设置读取数据连接超时时间
                .build();
        // 为httpPost实例设置配置
        httpPost.setConfig(requestConfig);
        // 设置请求头
        httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded");
        // 封装post请求参数
        if (null != paramMap && paramMap.size() > 0) {
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            // 通过map集成entrySet方法获取entity
            Set<Entry<String, Object>> entrySet = paramMap.entrySet();
            // 循环遍历，获取迭代器
            Iterator<Entry<String, Object>> iterator = entrySet.iterator();
            while (iterator.hasNext()) {
                Entry<String, Object> mapEntry = iterator.next();
                nvps.add(new BasicNameValuePair(mapEntry.getKey(), mapEntry.getValue().toString()));
            }

            // 为httpPost设置封装好的请求参数
            try {
                httpPost.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        try {
            // httpClient对象执行post请求,并返回响应参数对象
            httpResponse = httpClient.execute(httpPost);
            // 从响应对象中获取响应内容
            HttpEntity entity = httpResponse.getEntity();
            result = EntityUtils.toString(entity);
            //转化为Bean进行判断
            JsonRootBean jsonRootBean = JSONObject.parseObject(result, JsonRootBean.class);
            List<Date> collect = jsonRootBean.getItems().stream().map(Items::getTitle).collect(Collectors.toList());
            collect.forEach(date -> {
                LocalDate dateInJson = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                if (YESTODAY.isEqual(dateInJson)) {
                    FLAG.set(true);
                    return;
                }
            });
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            if (null != httpResponse) {
                try {
                    httpResponse.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != httpClient) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if (FLAG.get()) {
            System.out.println("------>Have");
        } else {
            System.out.println("------>Not Have");
        }
        return result;
    }
}
