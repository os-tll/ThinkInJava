package section8;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/2 9:53
 */
public class Ex17 {
    public static void main(String[] args) {
        Ex17Aid ex17Aid2 = new Ex17Aid2();
        Ex17Aid ex17Aid3 = new Ex17Aid3();
        //向上转型以后不可以访问子类独有
        //!  ex17Aid2.sonFun();
        //!  ex17Aid3.sonFun();
        Ex17Aid2 ex17Aid11 = (Ex17Aid2)ex17Aid2;
        Ex17Aid3 ex17Aid12 = (Ex17Aid3)ex17Aid3;
        ex17Aid11.sonFun();
        ex17Aid12.sonFun();

    }
}
class Ex17Aid{
    protected int i ;
    protected void fun(){
        System.out.println(i);
    }
}
class Ex17Aid2 extends Ex17Aid{
    public int i = 2;
    //调用父类方法则使用父类的i,调用子类的方法则使用子类的i
    @Override
    protected void fun(){
        System.out.println(i);
    }

    public void sonFun(){
        System.out.println("Ex17Aid2 sonfun");
    }
}
class Ex17Aid3 extends Ex17Aid{
    protected int i = 3;
    public void sonFun(){
        System.out.println("Ex17Aid3 sonfun");
    }
}
