package section11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/8 17:30
 */
public class Ex12 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(10,100,1));
        ListIterator<Integer> integerListIterator = integerArrayList.listIterator(integerArrayList.size());
        while(integerListIterator.hasPrevious()){
            Integer integer = integerListIterator.previous();
            arrayList.add(integer);
        }
        System.out.println(arrayList);
    }
}
