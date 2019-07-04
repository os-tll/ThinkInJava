package section9;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/2 10:57
 */
public class Ex5 implements Ex5Aid{

    @Override
    public void fun1() {
        System.out.println("fun1");
    }

    @Override
    public void fun2() {
        System.out.println("fun2");
    }

    @Override
    public void fun3() {
        System.out.println("fun3");
    }

    public static void main(String[] args) {
        Ex5 ex5 = new Ex5();
        ex5.fun1();
        ex5.fun2();
        ex5.fun3();
    }
}
interface Ex5Aid{
    void fun1();
    void fun2();
    void fun3();
}
