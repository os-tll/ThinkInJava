package section11;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/9 9:39
 */
public class Ex00 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>(Arrays.asList("12","23","34"));
        strings.addFirst("00");
        strings.removeFirst();
        strings.removeLast();
        System.out.println(strings);
    }
}
