package section3.excercise;

/**
 * 有符号右移
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/20 19:20
 */
public class Ex11 {
    public static void main(String[] args) {
        int i = -1*Integer.MAX_VALUE -1;
        System.out.println(Integer.toBinaryString(i));
        int loop = 32;
        while (--loop != 0){
            i>>=1;
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
