package section8;

/**
 * 多态机制
 * @author tanglonglong
 * @version 1.0
 * @date 2019/7/1 11:25
 */
public class Ex1 {
    public static void main(String[] args) {
        Ex1Aid ex1Aid2 = new Ex1Aid2();
        Ex1Aid ex1Aid3 = new Ex1Aid3();
        ex1Aid2.fun();
        ex1Aid3.fun();
    }
}
class Ex1Aid{
    protected int i ;
    protected void fun(){
        System.out.println(i);
    }
}
class Ex1Aid2 extends Ex1Aid{
    public int i = 2;
    //调用父类方法则使用父类的i,调用子类的方法则使用子类的i
    @Override
    protected void fun(){
        System.out.println(i);
    }
}
class Ex1Aid3 extends Ex1Aid{
    protected int i = 3;
}
