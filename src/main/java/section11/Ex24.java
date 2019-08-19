package section11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/11 13:20
 */
public class Ex24 {
    Map<String,Integer> map = new LinkedHashMap<>();

    public static void main(String[] args) {
        Ex24 ex24 = new Ex24();
        ex24.map.put("asc",2);
        ex24.map.put("asd",24);
        ex24.map.put("qds",22);
        ex24.map.put("zda",242);
        ex24.map.put("koa",21);
        ex24.map.put("auw",42);
        ex24.map.put("xoq",42);
        ex24.map.put("axo",28);
        TreeMap<String, Integer> treeMap = new TreeMap<>(ex24.map);
        System.out.println(treeMap);

    }
}
