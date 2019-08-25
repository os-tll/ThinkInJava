package exercise;

/**
 * https://mp.weixin.qq.com/s/TYPXI785CTJo1I7hOCo0mg
 * 希尔排序
 * 核心：通过步长的不断缩短，保证排序过的步长都是有序的，直至步长为1，兜底
 * 复杂度：Nlog(2N)
 *
 * @author tanglonglong
 * @version 1.0
 * @date 2019/8/25 14:26
 */
public class Sort6 {
    public static void main(String[] args) {
        Sort6 sort6 = new Sort6();
        int[] ints = {2, 1, 5, 0, 6, 0, 1, 3, 9};
        int[] sort = sort6.sort(ints);
        System.out.println(sort);
    }

    public int[] sort(int[] arr) {
        int length = arr.length;
        //控制步长，不断的缩短，直至1
        for (int gap = length / 2; gap >= 1; gap /= 2) {
            //从第一个元素开始，不断的进行查找合适位置
            for (int i = gap; i < length; i += gap) {
                int itemp = i;
                //查找合适位置的过程，当前一个元素比它小时，说明需要交换位置
                //i一直指定的是待移动的数
                //j一直指定的是i的前一个数
                for (int j = i - gap; j >= 0 && arr[j] > arr[i]; j -= gap) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    i -= gap;
                }
                i = itemp;
            }
        }
        return arr;
    }
}
