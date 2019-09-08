package sort;

import exercise.Sort;

/**
 * 堆
 *
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/8 11:52
 */
public class Sort6_2 {
    public static void main(String[] args) {
        Sort6_2 sort6_2 = new Sort6_2();
        int[] ints = Sort1.generateArray(100000);
//        int[] ints = {2,4,1,3,9,4,6,8,92,6,8,0,5};
        long timeMillis = System.currentTimeMillis();
        int[] sort = sort6_2.sort(ints);
        double v = (System.currentTimeMillis() - timeMillis) / 1000.0;
        System.out.println(v);
    }

    public int[] sort(int[] ints) {
        for (int i = (ints.length + 1) / 2; i >= 0; i--) {
            t(ints, i, ints.length);
        }
        for (int i = 0; i < ints.length; i++) {
            Sort.swap(ints, 0, ints.length - 1 - i);
            t(ints, 0, ints.length - 1 - i);
        }
        System.out.println(ints);
        return ints;

    }

    public void t(int[] ints, int i, int length) {
        int max = 2 * i + 1;
        if (max > length) {
            return;
        }
        while (max < length) {
            if (max + 1 < length && ints[max + 1] < ints[max]) {
                max = max + 1;
            }
            if (ints[max] < ints[i]) {
                Sort.swap(ints, i, max);
            }
            i = max;
            max = 2 * i + 1;
        }
    }
}
