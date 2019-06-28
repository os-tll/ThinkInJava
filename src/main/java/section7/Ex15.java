package section7;

import section6.Ex5;

/**
 * 验证protect的类属性
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/28 15:56
 */
public class Ex15 {
    public static void main(String[] args) {
        Ex5 ex5 = new Ex5();
        //本包外protected的方法和属性无法访问
//        ex5.h;
    }
}
class Ex15Aid extends Ex5{
    int h = super.h;
}
