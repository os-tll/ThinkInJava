package section3.excercise;

/**
 * efff先左移，然后无符号右移
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/20 19:36
 */
public class Ex12 {
    public static void main(String[] args) {

        int i = 0xffffffff;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        //左移6位
        i<<= 6;
        System.out.println(Integer.toBinaryString(i));
        int loop = 32;
        while (--loop != 0){
            //无符号右移
            i>>>=1;
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
