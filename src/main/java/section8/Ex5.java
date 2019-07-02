package section8;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/7/1 11:25
 */
public class Ex5 {
    public static void main(String[] args) {
        Ex5Aid ex5Aid2 = new Ex5Aid2();
        Ex5Aid ex5Aid3 = new Ex5Aid3();
        ex5Aid2.fun();
        ex5Aid2.fun();

    }
}
class Ex5Aid{
    protected int i ;
    protected void fun(){
        System.out.println(getI());
    }
    public int getI(){
        return 10;
    }
}
class Ex5Aid2 extends Ex5Aid{
    public int i = 2;
    //调用父类方法则使用父类的i,调用子类的方法则使用子类的i
    @Override
    protected void fun(){
        System.out.println(i);
    }
}
class Ex5Aid3 extends Ex5Aid{
    protected int i = 3;
}
