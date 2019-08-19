package section11;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/9 17:44
 */
public class Ex17 {
    public static void main(String[] args) {
        HashMap<Integer, Gerbil> stringGerbilHashMap = new HashMap<>();
        Gerbil gerbil1 = new Gerbil(123);
        Gerbil gerbil2 = new Gerbil(456);
        stringGerbilHashMap.put(gerbil1.gerbilNumber, gerbil1);
        stringGerbilHashMap.put(gerbil2.gerbilNumber, gerbil2);
        Iterator<Integer> iterator = stringGerbilHashMap.keySet().iterator();
        while (iterator.hasNext()){
            Integer key = iterator.next();
            Gerbil gerbil = stringGerbilHashMap.get(key);
            System.out.println(gerbil);
            gerbil.hop();
        }
    }
}
