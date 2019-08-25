package exercise;

/**
 * 直接插入排序
 * @author tanglonglong
 * @version 1.0
 * @date 2019/8/25 13:50
 */
public class Sort5 {
    public static void main(String[] args) {
        Sort5 sort5 = new Sort5();
        int[] ints = {2,1,5,0,6,0,1,3,9};
        int[] sort = sort5.sort(ints);
        System.out.println(sort);
    }
    public int[] sort(int[] arr){
        int length = arr.length;
        //假定第一个元素是由有序的
        for (int i = 1; i < length; i++) {
            //暂存，因为在里层for循环会改变
            int itemp = i;
            //查找此元素前的合适位置(查找过程中不断交换，实现往前面移动至合适位置)
            //i一直指定的是待移动的数
            //j一直指定的是i的前一个数
            for (int j = i - 1; j >= 0 && arr[j] > arr[i] ; j--) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i--;
            }
            //恢复i的数值
            i = itemp;
        }
        return arr;
    }
}
