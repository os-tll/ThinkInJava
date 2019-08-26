package sort;

/**
 * https://mp.weixin.qq.com/s/TYPXI785CTJo1I7hOCo0mg
 * 简单选择排序
 * 核心：选定一个最值，循环比较 复杂度N^2
 * 结果：17S左右
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/23 14:24
 */
public class Sort2 {
    public static void main(String[] args) {
        Sort1 sort1 = new Sort1();
        Sort2 sort2 = new Sort2();
        int[] ints = sort1.generateArray(100000);
        long timeMillis = System.currentTimeMillis();
        sort2.sort(ints);
        double v = (System.currentTimeMillis() - timeMillis) / 1000.0;
        System.out.println(v);
    }
    public int[] sort(int[] ints){
        int length = ints.length;
        int temp;
        for(int i = 0; i < length; i++){
            for(int j = i; j < length; j++){
                if(ints[j] < ints[i]){
                 temp = ints[j];
                 ints[j] = ints[i];
                 ints[i] = temp;
                }
            }
        }
        return ints;
    }
}
