package section11;

import java.util.*;

/**
 * 将Ex25的结果还原回去
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/11 18:23
 */
public class Ex26 {
    public static void main(String[] args) {
        Map<String, List<Integer>> listMap = new Ex25().getListMap();
       String[] arrayList = new String[10000];
        listMap.forEach( (key, value)->{
            value.forEach(integer -> {
                arrayList[integer]=key;
            });
        });
        System.out.println(Arrays.toString(arrayList));
    }
}
