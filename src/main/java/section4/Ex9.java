package section4;

import java.util.ArrayList;

/**
 * 产生波多菲尔数列 1 1 2 3 5 8 13 21...
 *
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/22 15:14
 */
public class Ex9 {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        new Ex9().list(100);

    }

    /**
     * 共展示i个波多菲尔数值，从1开始
     * @param i 总个数
     * @author tanglonglong
     * @date 15:17 2019/6/22
     */
    public void list(int i){
        //存放所有数值，共i个
        ArrayList<Long> arrayList = new ArrayList<>();
        //第一个数初始化
        arrayList.add(1L);
        if ( i  < 2){
            System.out.println(arrayList);
            return;
        }
        //第二个数初始化
        arrayList.add(1L);
        if ( i  < 3){
            System.out.println(arrayList);
            return;
        }
        //循环存入后i-2个数值
        i -= 2;
        while(i-- > 0){
            arrayList.add(arrayList.get(arrayList.size() - 1) + arrayList.get(arrayList.size() - 2));
        }
        System.out.println(arrayList);
    }
}
