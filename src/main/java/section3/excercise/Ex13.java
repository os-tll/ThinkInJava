package section3.excercise;

/**
 * 二进制显示char
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/20 19:48
 */
public class Ex13 {

    public static void main(String[] args) {
        boolean a = false;boolean b = true;
        boolean b1 = a & b;
        String arg = "abcdef";
        for(char c: arg.toCharArray()){
            System.out.println(c+":"+Integer.toBinaryString(c));
        }
    }
}
