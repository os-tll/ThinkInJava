package section11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 获取每个字符得每一个出现的位置
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/11 18:01
 */
public class Ex25 {
    public static void main(String[] args) {
        System.out.println(new Ex25().getListMap());
    }
    public Map<String,List<Integer>> getListMap(){
        HashMap<String,List<Integer>> listHashMap = new HashMap<>();
        try {
            List<String> strings = TextFile.readFile("E:/thinkinginjava/src/main/java/section11/Ex15.java");
            for (int i = 0; i < strings.size(); i++) {
                String s= strings.get(i);
                List<Integer> integers = listHashMap.get(s);
                if(integers == null){
                    integers = new ArrayList<>();
                }
                integers.add(i);
                listHashMap.put(s,integers);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHashMap;
    }
}
