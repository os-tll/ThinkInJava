package section7;

import java.util.Random;

/**
 * final与static final的区别：
 * final只是当前对象的常量，并非每个对象的一定一样。
 * static final则是类的，由于只加载一次，所以任何时候都是不会变得。
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/28 17:15
 */
public class Ex18 {
    static Random random = new Random(47);
    final int i = random.nextInt(10);
    static final int j = new Random(47).nextInt(10);

    public static void main(String[] args) {
        Ex18 ex18_1 = new Ex18();
        Ex18 ex18_2 = new Ex18();
        //这两条输出不一样，说明了问题
        System.out.println(ex18_1.i);
        System.out.println(ex18_2.i);
        System.out.println(ex18_1.j);
        System.out.println(ex18_2.j);
    }
}
