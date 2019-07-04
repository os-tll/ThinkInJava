package section9;

/**
 * 不知道这个练习用意在何，估计是接口多重继承可以向上转型
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/4 14:51
 */
public class Ex14 {
    public static void main(String[] args) {
        Ex14Aid5 ex14Aid5 = new Ex14Aid5();
        Ex14 ex14 = new Ex14();
        ex14.f1(ex14Aid5);
        ex14.f2(ex14Aid5);
        ex14.f3(ex14Aid5);
        ex14.f4(ex14Aid5);
    }
    public void f1(Ex14Aid1 ex14Aid1){

    }
    public void f2(Ex14Aid2 ex14Aid1){

    }
    public void f3(Ex14Aid3 ex14Aid1){

    }
    public void f4(Ex14Aid4 ex14Aid1){

    }
}
interface Ex14Aid1{
    void fun1();
    void fun2();
}
interface Ex14Aid2{
    void fun3();
    void fun4();
}
interface Ex14Aid3{
    void fun5();
    void fun6();
}
interface Ex14Aid4 extends Ex14Aid1,Ex14Aid2,Ex14Aid3{
    void fun7();
}
class Ex14Aid5 implements Ex14Aid4{

    @Override
    public void fun1() {

    }

    @Override
    public void fun2() {

    }

    @Override
    public void fun3() {

    }

    @Override
    public void fun4() {

    }

    @Override
    public void fun5() {

    }

    @Override
    public void fun6() {

    }

    @Override
    public void fun7() {

    }
}