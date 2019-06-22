package section3.excercise;

/**
 * 按位操作符
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/20 11:47
 */
public class Ex10 {
    public static void main(String[] args) {
        //0010 1010
        byte a = 0x2a;
        //0101 0101
        byte b = 0x55;
        //按位与 0000 0000
        System.out.println(Integer.toBinaryString(a&=b));
        //按位或 0111 1111
        System.out.println(Integer.toBinaryString(a|b));
        //按位异或 0111 1111
        System.out.println(Integer.toBinaryString(a^b));
        //按位非（一元） 1101 0101
        System.out.println(Integer.toBinaryString(~a));
        //移动一位与移动33位效果相同，有效位是二进制后五位
        //0010 1011
        byte c = 0x2b;
        System.out.println(Integer.toBinaryString(c<<1));
        System.out.println(Integer.toBinaryString(c<<33));

        short s = -1;
        //这一步实际发生的事情为 short->int , 无符号右移 17 位， int->short（截位）
        s>>>=17;
        System.out.println(Integer.toBinaryString(s));
        System.out.println(s);


    }
}
