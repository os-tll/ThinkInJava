package section11;

import java.util.*;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/10 17:29
 */
public class Ex21 {
    public static void main(String[] args) {
        try {
            Map<String,Integer> map = new TreeMap<>();
            List<String> strings = TextFile.readFile("E:/thinkinginjava/src/main/java/section11/Ex15.java");
            strings.forEach( s ->{
                int temp = 0;
                System.out.println(s+"<-");
                if(null==s){
                    return;
                }
                if(map.containsKey(s)){
                    temp = map.get(s);
                }
                map.put(s, temp+1);
            });
            System.out.println(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
