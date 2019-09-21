package section11;

import java.util.*;

/**
 * 适配器，iterable多种实现
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/21 10:25
 */
public class Ex32 {
    public static void main(String[] args) {
        Ex32Aid ex32Aid = new Ex32Aid();
        ex32Aid.original().forEach(System.out::print);
        ex32Aid.reversed().forEach(System.out::print);
        for (Integer decimal : ex32Aid.randomized()) {
            System.out.print(decimal);
        }
        System.out.println(Arrays.toString(ex32Aid.bak));
    }
}

class Ex32Aid {
    Integer[] bak = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    /**
     * 顺序
     */
    Iterable<Integer> original() {
        return () -> new Iterator<Integer>() {
            private int index = 0;

            @Override
            public boolean hasNext() {

                return index < bak.length;
            }

            @Override
            public Integer next() {
                return bak[index++];
            }
        };
    }

    /**
     * 倒序
     */
    Iterable<Integer> reversed() {
        return () -> new Iterator<Integer>() {
            private int index = bak.length - 1;

            @Override
            public boolean hasNext() {
                return index > -1;
            }
            @Override
            public Integer next() {
                return bak[index--];
            }
        };
    }

    /**
     * 打乱
     */
    Iterable<Integer> randomized() {
        return () -> new Iterator<Integer>() {
            private List<Integer> randomList = new ArrayList<>(Arrays.asList(bak));
            private int index = 0;

            {
                Collections.shuffle(randomList, new Random(47));
            }

            @Override
            public boolean hasNext() {

                return index < randomList.size();
            }

            @Override
            public Integer next() {
                return randomList.get(index++);
            }
        };
    }
}