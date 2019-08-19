package section11;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 通过使用preview实现在LinkedList中间不断的插入数据
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/8 21:01
 */
public class Ex14 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ListIterator<Integer> integerListIterator = list.listIterator();
        for (int i = 0; i < 19; i++) {
            integerListIterator.add(i);
            integerListIterator.previous();
            integerListIterator.add(++i);
        }
        System.out.println(list);
    }
}
