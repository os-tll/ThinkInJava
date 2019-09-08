package sort;

import exercise.Sort;

/**
 * shell
 *
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/8 11:03
 */
public class Sort5_2 {
    public static void main(String[] args) {
        Sort5_2 sort5_2 = new Sort5_2();
        int[] ints = Sort1.generateArray(100000);
//        int[] ints = {5, 1, 2, 4, 0, 43, 1, 78, 9, 1, 0, 456, 3};
        long timeMillis = System.currentTimeMillis();
        for (int i = ints.length / 2; i >= 1; i /= 2) {
            sort5_2.sort(ints,i);
        }
        double v = (System.currentTimeMillis() - timeMillis) / 1000.0;
        System.out.println(v);
    }

    public int[] sort(int[] ints, int step) {
        int length = ints.length;
        for (int i = step; i < length; i++) {
            int temp = i;
            for (int j = i - step; j >= 0 && ints[i] > ints[j]; j -= step, i -= step) {
                Sort.swap(ints, i, j);
            }
            i = temp;
        }
        return ints;
    }
}
