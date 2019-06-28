package section7;

/**
 * 验证重载
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/28 15:27
 */
public class Ex13 {
    public static void main(String[] args) {
        Ex13Aid4 ex13Aid4 = new Ex13Aid4();
        ex13Aid4.fun(1);
        ex13Aid4.fun((short) 1);
        ex13Aid4.fun(' ');
        ex13Aid4.fun(1L);
    }
}
class Ex13Aid{
    protected void fun(int i){
        System.out.println("Ex13Aid");
    }
}
class Ex13Aid2 extends Ex13Aid{
    protected void fun(short i){
        System.out.println("Ex13Aid2");
    }
}
class Ex13Aid3 extends Ex13Aid2{
    protected void fun(char i){
        System.out.println("Ex13Aid3");
    }
}
class Ex13Aid4 extends Ex13Aid3{
    protected void fun(long i){
        System.out.println("Ex13Aid4");
    }
}
