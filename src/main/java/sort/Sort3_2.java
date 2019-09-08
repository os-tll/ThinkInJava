package sort;

import exercise.Sort;

/**
 * https://mp.weixin.qq.com/s/TYPXI785CTJo1I7hOCo0mg
 * 快排
 * 核心思想：通过左右两个指针和一个基数，进行交换排序
 * 结果： 平均复杂度 NlogN 用时0.03S
 *
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/29 15:08
 */
public class Sort3_2 {
    public static void main(String[] args) {
        Sort1 sort1 = new Sort1();
        Sort3_2 sort3_2 = new Sort3_2();
        int[] ints = Sort1.generateArray(1000000);
        long timeMillis = System.currentTimeMillis();
        sort3_2.sort(ints, 0, ints.length - 1);
        double v = (System.currentTimeMillis() - timeMillis) / 1000.0;
        System.out.println(v);
    }

    public int[] sort(int[] ints, int begin, int end) {
        if(begin >= end){
            return ints;
        }
//        System.out.println("begin->"+begin+"-"+ints[begin]+"end->"+end+"-"+ints[end]);
        int left = begin;
        int right = end;
        int base = ints[begin];
        //false 左侧查找  true 右侧查找
        boolean leftRightFlag = true;
        while (left != right ) {
            if (leftRightFlag) {
                if(ints[right] > base){
                    ints[left] = ints[right];
                    leftRightFlag = false;
                }else {
                    right--;
                }
                continue;
            }
            if (!leftRightFlag) {
                if (ints[left] < base) {
                    ints[right] = ints[left];
                    leftRightFlag = true;
                } else {
                    left++;
                }
                continue;
            }
        }
        ints[left] = base;
        sort(ints, begin, left - 1);
        sort(ints, right + 1, end);
        return ints;
    }
}
