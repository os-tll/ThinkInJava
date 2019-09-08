package sort;

/**
 * https://mp.weixin.qq.com/s/TYPXI785CTJo1I7hOCo0mg
 * 归并排序
 * 核心：分治法，使得各个段内有序，端间再有序，然后进行合并为一个有序表，即二路归并
 * 复杂度： nlog(2n) 用时0.02S
 *
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/26 15:41
 */
public class Sort7 {
    public static void main(String[] args) {
        Sort1 sort1 = new Sort1();
        int[] ints = Sort1.generateArray(100000);
        long timeMillis = System.currentTimeMillis();
//        int[] ints = {6,7,8,9,10,4,6,7};
        Sort7 sort7 = new Sort7();
        //间距从gap为1开始，稳妥的做法是最大到length
        for (int i = 1; i < ints.length; i*=2) {
            sort7.cycleMerge(ints,i, ints.length);
        }
        double v = (System.currentTimeMillis() - timeMillis) / 1000.0;
        System.out.println(v);
    }
    /**
     * 进行两段数据的合并
     * @param arr 总数组
     * @param begin 第一段开始下标
     * @param media 第一段结尾下标
     * @param high 第二段结尾下标
     * @author tanglonglong ＼(－－)／
     * @date 16:29 2019/8/26
     */
    public void merge(int[] arr, int begin, int media, int high){
        int i = begin;
        int j = media+1;
        int[]  tempArr = new int[high-begin+1];
        int k = 0;
        //进行两段比较合并到临时数组中，直到有一段完了为止
        while(i <= media && j <= high){
            if(arr[i] <= arr[j]){
                tempArr[k++] = arr[i++];
            }else{
                tempArr[k++] = arr[j++];
            }
        }
        //进行两段中剩下一段的复制
        while (i <= media){
            tempArr[k++] = arr[i++];
        }
        while (j <= high){
            tempArr[k++] = arr[j++];
        }
        //将tempArr再赋值给原数组
        for (int l = 0; l < high-begin+1; l++) {
            arr[begin+l] = tempArr[l];
        }
    }
    /**
     * 对gap间距所有段数据的进行循环归并
     * @param arr 总数组
     * @param gap 间距
     * @param length 长度
     * @return int[]
     * @author tanglonglong ＼(－－)／
     * @date 17:42 2019/8/26
     */
    public int[] cycleMerge(int[] arr, int gap, int length){
        int i = 0;
        //当gap=1
        //merge(arr,0,0,1);
        //merge(arr,2,2,3);
        //merge(arr,4,4,5);
        //当gap=2
        //merge(arr,0,1,3);
        //merge(arr,4,5,7);
        //当gap=4
        //merge(arr,0,3,7);
        //...
        //o(╥﹏╥)o 这里通过找规律来写这个循环吧，太难了
        for (; i + 2*gap < length; i+=2*gap) {
            merge(arr,i,i+gap-1,i+2*gap-1);
        }
        //若最后剩下一段，那什么也不做,否则执行语句
        if(i+gap-1 <= length-1){
            //最后剩下两段需要特殊考虑，因为可能剩下的最后一段没gap那么长
            merge(arr,i,i+gap-1,arr.length-1);
        }
        return arr;
    }
}
