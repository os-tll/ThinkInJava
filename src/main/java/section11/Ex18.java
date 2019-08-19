package section11;

import java.util.*;

/**
 * 题意不明。。。Map是String，String
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/9 17:55
 */
public class Ex18 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("22","123");
        hashMap.put("1","234");
        hashMap.put("23","345");
        System.out.println(hashMap);

        //插入到LinkedHashMap中
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        Set<String> strings = hashMap.keySet();
        //按照散列码进行排序
        String[] objects =  strings.toArray(new String[strings.size()]);
        Arrays.sort(objects);
        for(String hashCode :  objects){
            String s = hashMap.get(hashCode);
            linkedHashMap.put(hashCode, s);
        }
        System.out.println(linkedHashMap);
    }
}
