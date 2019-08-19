package section11;

import java.util.*;

/**
 * 使用迭代器进行改造
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/8 16:09
 */
public class Ex11 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("11","22"));
        new Ex11().fun(arrayList);

    }
    public void fun(Collection collection){
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
