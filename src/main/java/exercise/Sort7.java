package exercise;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 堆排序
 * @author tanglonglong
 * @version 1.0
 * @date 2019/8/25 15:41
 */
public class Sort7 {
    public static void main(String[] args) {
        Sort7 sort7 = new Sort7();
        int[] ints = {3,2,1,4,5};
        ints = sort7.sort(ints);
        System.out.println(ints);
    }
    public int[] sort(int[] ints){
        int length = ints.length;
        int[] arr = new int[length];
        for (int i = 0; i < length ; i++) {
            this.getTree(ints);
            swap(ints,0,ints.length-1);
            arr[length - i - 1] = ints[ints.length -1];
            ints = Arrays.copyOf(ints, ints.length-1);
        }
        return arr;
    }
    //方案一之垃圾实现，使用了递归
    /*
    public void getTree(int[] ints){
        for (int i = 0; 2 * i + 1 <= ints.length - 1; i++) {
            boolean flag = false;
            int father = (i - 1) / 2;
            int sonLeft = 2 * i + 1;
            int sonRight = 2 * i + 2;
            if(sonLeft <= ints.length -1 && ints[sonLeft]>ints[i]){
                swap(ints, i, sonLeft);
                flag = true;
            }
            if(sonRight <= ints.length -1 && ints[sonRight]>ints[i]){
                swap(ints,i, sonRight);
                flag = true;
            }
            if(ints[i]>ints[father]){
                swap(ints,i, father);
                flag = true;
            }
            if (flag){
                getTree(ints);
            }
        }
    }
    */
    public int[] getTree(int[] ints) {
        int length = ints.length;
        for (int i = length / 2; i >= 0; i--) {
            int tempi = i;
            //此节点不存在子节点，直接进行下个节点
            if( 2 * i + 1 > length-1){
                continue;
            }
            //定义子节点，初始化为左节点
            int childMax = 2 * i + 1;
            while (childMax < length){
                //在当前的节点下，选出子节点中最大的一个值
                if(childMax +1 < length && ints[childMax+1] > ints[childMax]){
                    childMax = childMax + 1;
                }
                //判断当前节点与子节点中最大值孰更大
                if(ints[i] < ints[childMax]){
                    swap(ints, i ,childMax);
                }
                //迭代子孙中所有节点，防止换下来的这个值不如子孙节点中的大
                i = childMax;
                childMax = 2 * i + 1;
            }
            i = tempi;
        }
        return  ints;
    }
        public void swap(int[] ints,int a, int b){
        int temp = ints[a];
        ints[a] = ints[b];
        ints[b] = temp;
    }
}
