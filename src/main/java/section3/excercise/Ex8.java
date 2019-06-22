package section3.excercise;

/**
 * 进制练习
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/20 9:21
 */
public class Ex8 {
    public static void main(String[] args) {
        //long类型有64位，-2^63 ~ 2^63 -1,最大正数63位
        //十六进制表示最大值
        long hexadecimal = 0x7fffffffffffffffL;
        //八进制表示最大值
        long octal = 0777777777777777777777L;
        System.out.println(Long.toBinaryString(hexadecimal));
        System.out.println(Long.toBinaryString(octal));
        System.out.println(Long.toBinaryString(Long.MAX_VALUE));
    }
}
