package sort;

import java.util.Arrays;

/**
 * https://mp.weixin.qq.com/s/TYPXI785CTJo1I7hOCo0mg
 * 堆排序
 * 核心：使用堆数据结构，不断找最大值
 * 复杂度: NLog(2N) 用时0.016S
 *
 * @author tanglonglong
 * @version 1.0
 * @date 2019/8/25 15:41
 */
public class Sort6 {
    public static void main(String[] args) {
        Sort1 sort1 = new Sort1();
        Sort6 sort6 = new Sort6();
        int[] ints = sort1.generateArray(100000);
//        int[] ints = {2,4,1,3,9,4,6,8,92,6,8,0,5};
        long timeMillis = System.currentTimeMillis();
        int[] sort = sort6.sort(ints);
        double v = (System.currentTimeMillis() - timeMillis) / 1000.0;
        System.out.println(v);
    }
    public int[] sort(int[] ints){
        int length = ints.length;
        //循环建立初始堆
        for (int i = length/2; i>=0; i--) {
            this.getTree(ints,i,length);
        }
        //开始进行循环取数
        for (int i = 0; i < length; i++) {
            swap(ints,0,length - i - 1);
            this.getTree(ints,0,length-i-1);
        }
        return ints;
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
    //方案二之正宗实现
    //使得begin节点插入到合适的子节点位置处
    public int[] getTree(int[] ints ,int begin, int length) {

            //此节点不存在子节点，直接进行上个节点
            if( 2 * begin + 1 > length-1){
                return ints;
            }
            //定义子节点，初始化为左节点
            int childMax = 2 * begin + 1;
            while (childMax < length){
                //在当前的节点下，选出子节点中最大的一个值
                if(childMax +1 < length && ints[childMax+1] > ints[childMax]){
                    childMax = childMax + 1;
                }
                //判断当前节点与子节点中最大值孰更大
                if(ints[begin] < ints[childMax]){
                    swap(ints, begin ,childMax);
                }
                //迭代子孙中所有节点，防止换下来的这个值不如子孙节点中的大
                begin = childMax;
                childMax = 2 * begin + 1;
            }
        return  ints;
    }
        public void swap(int[] ints,int a, int b){
        int temp = ints[a];
        ints[a] = ints[b];
        ints[b] = temp;
    }
}
