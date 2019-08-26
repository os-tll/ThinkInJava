package section11;

import java.util.*;

/**
 * PriorityQueue存储Double
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/19 21:45
 */
public class Ex28 {
    public static void main(String[] args) {
        PriorityQueue<Double> doubles = new PriorityQueue<>(Collections.reverseOrder());
        Random random = new Random(47);
        for (int i = 0; i < 20; i++) {
            doubles.offer((double) random.nextFloat());
        }
        int i = 1;
        while (!doubles.isEmpty()){

            System.out.println(i+++"->"+doubles.poll());
        }
    }
}
