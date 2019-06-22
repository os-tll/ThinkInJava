package section4;

import java.util.Arrays;

/**
 * 使用移位的方式打印数值的二进制
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/21 11:57
 */
public class Ex5 {
    public static void main(String[] args) {
        //0010 1010
        byte a = 0x2a;
        //0101 0101
        byte b = 0x55;
        //按位与 0000 0000
        new Ex5().printByteBinary(a&b);
        System.out.println(Integer.toBinaryString(a&b));
        //按位或 0111 1111
        new Ex5().printByteBinary(a|b);
        System.out.println(Integer.toBinaryString(a|b));
        //按位异或 0111 1111
        new Ex5().printByteBinary(a^b);
        System.out.println(Integer.toBinaryString(a^b));
        //按位非（一元） 1101 0101
        new Ex5().printByteBinary(~a);
        System.out.println(Integer.toBinaryString(~a));
    }
    /**
     * 打印数据的二进制形式
     * @param a 传入的数据
     * @return void
     * @author tanglonglong
     * @date 14:09 2019/6/21
     */
    public void printByteBinary(int a){
        int[] bit = new int[32];
        //符号位特殊处理
        bit[0] = a >= 0 ? 0 : 1;
        for(int i = 0; i < 31; i++){
            //注意负数取余数，结果为负数
            bit[31-i] = ((a >>> i) % 2 == 0) ? 0 : 1;
        }
        System.out.println(Arrays.toString(bit));
    }
}
