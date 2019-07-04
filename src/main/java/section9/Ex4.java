package section9;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/2 10:24
 */
public class Ex4 {
    public static void main(String[] args) {
        Ex4Aid2.fun(new Ex4Aid2());
    }
}
abstract class Ex4Aid{
    abstract protected void show();
}
class Ex4Aid2 extends Ex4Aid{
    @Override
    public void show(){
        System.out.println("123");
    }
    public static void fun(Ex4Aid ex4Aid){
//        Ex4Aid2 ex4Aid2 = (Ex4Aid2)ex4Aid;
//        ex4Aid2.show();
        ex4Aid.show();
    }

}
