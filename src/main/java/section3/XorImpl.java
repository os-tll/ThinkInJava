package section3;

/**
 * 使用位运算异或来进行判断
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/20 10:27
 */
public class XorImpl {
    public static void main(String[] args) {
        boolean a = true;boolean b = false;
        boolean b1 = a ^ b;
        //约定俗成  1 true 0 false
        int arg0Flag =  (Integer.valueOf(args[0]) > 1) ? 1 : 0;
        int arg1Flag =  (Integer.valueOf(args[1]) > 1) ? 1 : 0;
        System.out.println(arg0Flag^arg1Flag);
    }
}
