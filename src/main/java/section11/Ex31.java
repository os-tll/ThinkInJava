package section11;

import java.util.Iterator;

/**
 * Iterable接口 与 foreach
 *
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/21 20:33
 */
public class Ex31 {
    static class Ex31Aid implements Iterable {

        private String[] strs = {"1", "23", "43", "13", "53", "21", "52", "15", "03"};
        private int count;

        Ex31Aid(int count) {
            this.count = count;
        }

        @Override
        public Iterator iterator() {
            return new Iterator() {
                int i = 0;

                @Override
                public boolean hasNext() {
                    return i < count;
                }

                @Override
                public String next() {
                    return strs[i++];
                }
            };
        }
    }

    public static void main(String[] args) {
        Ex31Aid ex31Aid = new Ex31Aid(3);
        for (Object o : ex31Aid) {
            System.out.println(o);
        }

    }
}
