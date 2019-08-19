package section11;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 熟悉迭代器
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/7 16:55
 */
public class Ex8 {


    ArrayList<Gerbil> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Ex8 ex8 = new Ex8();
        ex8.arrayList.add(new Gerbil(1));
        ex8.arrayList.add(new Gerbil(2));
        ex8.arrayList.add(new Gerbil(3));
        Iterator<Gerbil> iterator = ex8.arrayList.iterator();
        while (iterator.hasNext()){
            Gerbil next = iterator.next();
            next.hop();
        }
    }
}