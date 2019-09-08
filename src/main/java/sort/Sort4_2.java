package sort;

import exercise.Sort;

/**
 *  插入排序，由大到小
 *  核心：不断移动，直至合适的位置
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/8 10:28
 */
public class Sort4_2  {
    public static void main(String[] args) {
        Sort4_2 sort4_2 = new Sort4_2();
        int[] ints = Sort1.generateArray(100000);
//        int[] ints = {5,1,2,4,0,43,1,78,9,1,0,456,3};
        long timeMillis = System.currentTimeMillis();
        sort4_2.sort(ints);
        double v = (System.currentTimeMillis() - timeMillis) / 1000.0;
        System.out.println(v);
    }
    public int[] sort(int[] ints){
        int length = ints.length;
        for (int i = 1; i < length; i++) {
            int temp = i;
            for (int j = temp-1; j >= 0; j--) {
                if(ints[j] <= ints[i]){
                    Sort.swap(ints,i,j);
                    i--;
                }else {
                    break;
                }
            }
            i = temp;
        }
        return ints;
    }
}
