package sort;

import java.util.Random;

/**
 * https://github.com/dunwu/algorithm-tutorial/tree/master/codes/algorithm/src/main/java/io/github/dunwu/algorithm/sort/strategy
 * https://mp.weixin.qq.com/s/TYPXI785CTJo1I7hOCo0mg
 * 冒泡排序
 * 核心：前后两两交换  复杂度为N^2
 * 结果：共用时18S左右
 * 优化：添加DoneFlag，防止无用循环17S左右
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/23 14:03
 */
public class Sort1 {
    public static void main(String[] args) {
        Sort1 sort1 = new Sort1();
        int[] ints = sort1.generateArray(100000);
        long timeMillis = System.currentTimeMillis();
        sort1.sort(ints);
        double v = (System.currentTimeMillis() - timeMillis) / 1000.0;
        System.out.println(v);
    }
    public int[] generateArray(int size){
        Random random = new Random(47);
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = random.nextInt(size*10000);
        }
        return ints;
    }
    public int[] sort(int[] arr){
        int length = arr.length;
        int temp;
        for (int i = 0; i <= length-1; i++){
//            boolean doneFlag = false;
             for(int j = length - 1; j > i; j--){
                 if(arr[j - 1] > arr[j]){
                     temp = arr[j - 1];
                     arr[j - 1] = arr[j];
                     arr[j] = temp;
//                     doneFlag = true;
                 }
             }
//             if(!doneFlag){
//                 break;
//             }
        }
        return arr;
    }
}
