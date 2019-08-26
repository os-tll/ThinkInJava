package sort;

/**
 * https://mp.weixin.qq.com/s/TYPXI785CTJo1I7hOCo0mg
 * 插入排序
 * 核心思想：（脑补抓牌）每一趟将一个待排序的记录，按照其关键字的大小插入到有序队列的合适位置里
 * 结果： 复杂度N^2 方案一与方案二用时5S左右 方案三用时4S左右
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/23 16:10
 */
public class Sort4 {
    public static void main(String[] args) {
        Sort1 sort1 = new Sort1();
        Sort4 sort4 = new Sort4();
        int[] ints = sort1.generateArray(100000);
//        int[] ints = {2,4,1,3,0,5};
        long timeMillis = System.currentTimeMillis();
        int[] sort = sort4.sort(ints);
        double v = (System.currentTimeMillis() - timeMillis) / 1000.0;
        System.out.println(v);
    }

    public int[] sort(int[] ints){
        int length = ints.length;
//        方案一：使用临时数组
//        int[] newInts = new int[length];
//        for (int i = 0; i < length; i++) {
//            for(int j = 0; j < length; j++){
//                if (ints[i] < newInts[j] || newInts[j] == 0){
//                    for(int k = length-1; k > j; k--){
//                        newInts[k] = newInts[k-1];
//                    }
//                    newInts[j] = ints[i];
//                    break;
//                }
//            }
//        }
//        return newInts;
        //方案二：不使用临时数组
//        for (int i = 1; i < length; i++) {
//           if(ints[i]<ints[i-1]){
//               for (int j = 0; j < i; j++) {
//                   if(ints[i] <= ints[j]){
//                       for (int k = i; k > j ; k--) {
//                           int temp = ints[k];
//                           ints[k] = ints[k-1];
//                           ints[k-1] = temp;
//                       }
//                   }
//               }
//           }
//        }
        //方案三：直接使用两层循环搞定
        //假定第一个元素是由有序的
        for (int i = 1; i < length; i++) {
            //暂存，因为在里层for循环会改变
            int itemp = i;
            //查找此元素前的合适位置(查找过程中不断交换，实现往前面移动至合适位置)
            //i一直指定的是待移动的数
            //j一直指定的是i的前一个数
            for (int j = i - 1; j >= 0 && ints[j] > ints[i] ; j--) {
                int temp = ints[j];
                ints[j] = ints[i];
                ints[i] = temp;
                i--;
            }
            //恢复i的数值
            i = itemp;
        }
        return ints;
    }
}

