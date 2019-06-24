package section5;

/**
 * 打印数组，数组末尾逗号会被忽略
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/24 11:21
 */
public class Ex15 {
    int[] iarr = new int[]{1,2,3,};

    public static void main(String[] args) {
        Ex15 ex15 = new Ex15();
        for (int a : ex15.iarr){
            System.out.println(a);
        }
        System.out.println("length:"+new Ex15().iarr.length);
    }
}
