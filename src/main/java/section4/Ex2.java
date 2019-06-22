package section4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * 25个随机值，分类为大于小于或等于紧随它而产生的随机值
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/20 21:36
 */
public class Ex2 {
    public static void main(String[] args) {
        Random random = new Random(47);
        int loop = 25;
        int[] intArray = new int[loop];
        for (int i = 0;i < loop; i++){
            intArray[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(intArray));
        new Ex2().classify(intArray);
    }

    /**
     * 分类为大于小于或等于紧随它而产生的随机值
     * @param ints 随机值数组
     */
    protected void classify(int[] ints){

        ArrayList<Integer> equalArray = new ArrayList<>();
        ArrayList<Integer> lagerArray = new ArrayList<>();
        ArrayList<Integer> smallerArray = new ArrayList<>();

        for (int i = 0; i < ints.length; i++){
            //最后一个值，放入等于中
            if (i == ints.length -1){
                equalArray.add(ints[i]);
                break;
            }
            //大于紧随产生的
            if (ints[i] > ints[i+1]){
                //:FIXME
                lagerArray.add(ints[i]);
            //小于紧随产生的
            } else if (ints[i] < ints[i+1]){
                smallerArray.add(ints[i]);
            }else {
                equalArray.add(ints[i]);
            }
        }
        System.out.println("smaller:"+ smallerArray);
        System.out.println("lagerArray:"+lagerArray);
        System.out.println("equal:"+equalArray);
    }
}
