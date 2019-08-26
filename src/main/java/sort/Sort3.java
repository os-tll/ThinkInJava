package sort;

/**
 * https://mp.weixin.qq.com/s/TYPXI785CTJo1I7hOCo0mg
 * 快排
 * 核心思想：通过左右两个指针和一个基数，进行交换排序
 * 结果： 平均复杂度 NlogN 用时0.03S
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/23 15:19
 */
public class Sort3 {
    public static void main(String[] args) {
        Sort1 sort1 = new Sort1();
        Sort3 sort3 = new Sort3();
        int[] ints = sort1.generateArray(100000);
        long timeMillis = System.currentTimeMillis();
        sort3.sort(ints,0,ints.length-1);
        double v = (System.currentTimeMillis() - timeMillis) / 1000.0;
        System.out.println(v);

    }

    public int[] sort(int[] ints, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return ints;
        }
        int leftIndexTemp = leftIndex;
        int rightIndexTemp = rightIndex;
        int base = ints[leftIndex];

        while (rightIndex != leftIndex) {

            //左指针位置不动，右指针向左靠拢
            while (rightIndex > leftIndex) {
                if (ints[rightIndex] < base) {
                    ints[leftIndex] = ints[rightIndex];
                    break;
                }
                rightIndex--;
            }
            //右指针位置不动，左指针向右靠拢
            while (rightIndex > leftIndex) {
                if (ints[leftIndex] > base) {
                    ints[rightIndex] = ints[leftIndex];
                    break;
                }
                leftIndex++;
            }
        }
        //将base赋值给指针相遇处
        ints[rightIndex] = base;

        //相遇处的数据是位置固定不用再动的
        sort(ints, leftIndexTemp, rightIndex - 1);
        sort(ints, leftIndex + 1, rightIndexTemp);
        return ints;
    }
}