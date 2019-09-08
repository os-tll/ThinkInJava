package sort;

import exercise.Sort;

import java.util.Random;

/**
 * https://github.com/dunwu/algorithm-tutorial/tree/master/codes/algorithm/src/main/java/io/github/dunwu/algorithm/sort/strategy
 * https://mp.weixin.qq.com/s/TYPXI785CTJo1I7hOCo0mg
 * 冒泡排序 由大到小
 * 核心：前后两两交换  复杂度为N^2
 * 结果：共用时18S左右
 * 优化：添加DoneFlag，防止无用循环17S左右
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/29 14:24
 */
public class Sort1_2 {

    public static void main(String[] args) {
        Sort1_2 sort1_2 = new Sort1_2();
        int[] ints = Sort1.generateArray(100000);
        long timeMillis = System.currentTimeMillis();
        sort1_2.sort(ints);
        double v = (System.currentTimeMillis() - timeMillis) / 1000.0;
        System.out.println(v);
    }

    public int[] sort(int[] ints){
        int length = ints.length;
        for (int i = 0; i < length; i++) {
            boolean swapFlag = false;
            for (int j = length - 1; j > i; j--) {
                if( ints[j - 1] < ints[j] ){
                    Sort.swap(ints, j, j-1);
                    swapFlag = true;
                }
            }
            if(!swapFlag){
                break;
            }
        }
        return ints;
    }
}
