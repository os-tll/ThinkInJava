package sort;

import exercise.Sort;
import org.apache.poi.util.ArrayUtil;

import java.util.Arrays;

/**
 * https://mp.weixin.qq.com/s/TYPXI785CTJo1I7hOCo0mg
 * 简单选择排序
 * 核心：选定一个最值，循环比较 复杂度N^2
 * 结果：17S左右
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/29 14:42
 */
public class Sort2_2 {
    public static void main(String[] args) {
        Sort2_2 sort2_2 = new Sort2_2();
        int[] ints = Sort1.generateArray(100000);
        long timeMillis = System.currentTimeMillis();
        sort2_2.sort(ints);
//        Sort1_2 sort1_2 = new Sort1_2();
//        int[] ints2 = Sort1.generateArray(100000);
//        sort1_2.sort(ints2);
//        for (int i = 0; i < ints.length; i++) {
//            if(ints[i]!=ints2[i]){
//                System.out.println("ERROR!BOMB");
//            }
//        }
        double v = (System.currentTimeMillis() - timeMillis) / 1000.0;
        System.out.println(v);
    }
    private int[] sort(int[] ints){
        int length = ints.length;
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if(ints[j] < ints[i]){
                    Sort.swap(ints, i, j);
                }
            }
        }
        return ints;
    }
}
