package sort;


import java.util.Random;

/**
 * https://baike.baidu.com/item/%E5%9F%BA%E6%95%B0%E6%8E%92%E5%BA%8F/7875498?fr=aladdin
 * 基数排序
 * 核心：桶子排序,不进行数据间的比较,将要排序的元素分配至某些“桶”中，藉以达到排序的作
 * 复杂度：
 * 设待排序列为n个记录，d个关键码，关键码的取值范围为radix，
 * 则进行链式基数排序的时间复杂度为O(d(n+radix))，
 * 其中，一趟分配时间复杂度为O(n)，一趟收集时间复杂度为O(radix)， 共进行d趟分配和收集。
 * 空间效率：需要2*radix个指向队列的辅助空间，以及用于静态链表的n个指针。
 * 0.03S
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/26 17:56
 */
public class Sort8 {

    public static void main(String[] args) {
        Sort8 sort8 = new Sort8();
        int[] ints = sort8.generateArray(100000);
//        int[] ints = {2, 1234, 1, 3, 1234329, 43, 64, 8, 92, 6, 8234, 0, 13245};
        long timeMillis = System.currentTimeMillis();
        for (int k = 0; k < 10; k++) {
            int i = sort8.maxNumLength(ints);
            int[] sort = sort8.sort(ints, i);
        }
        double v = (System.currentTimeMillis() - timeMillis) / 1000.0;
        System.out.println(v);
    }

    public int[] sort(int[] ints, int maxNumLength) {
        int length = ints.length;
        for (int i = 0; i < maxNumLength; i++) {
            int tempi = i;
            //二维数组，一维用来放0~9，二维用来放符合一维的数据
            int[][] arr = new int[10][length];
            //用来计数，统计每个一维对应的数据个数
            int[] arrAid = new int[10];
            int base = 1;
            while (i-- > 0) {
                base *= 10;
            }
            for (int j = 0; j < length; j++) {
                int remainder = (ints[j] / base) % 10;
                arr[remainder][arrAid[remainder]++] = ints[j];
            }
            int index = 0;
            for (int j = 0; j <= 9; j++) {
                int arrCount = arrAid[j];
                for (int k = 0; k < arrCount; k++) {
                    ints[index++] = arr[j][k];
                }
            }
            i = tempi;
        }
        return ints;
    }

    public int maxNumLength(int[] ints) {
        int max = 0;
        for (int i = 0; i < ints.length; i++) {
            int tempMaxLength = 1;
            int tempNum = ints[i];
            while ((tempNum /= 10) > 0) {
                tempMaxLength++;
            }
            max = tempMaxLength > max ? tempMaxLength : max;
        }
        return max;
    }
    public int[] generateArray(int size){
        Random random = new Random(47);
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = random.nextInt(size*10000);
        }
        return ints;
    }
}
