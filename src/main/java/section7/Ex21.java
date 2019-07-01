package section7;

/**
 * final类型的方法，继承后无法被覆盖
 * @author tanglonglong
 * @version 1.0
 * @date 2019/7/1 10:23
 */
public class Ex21 extends Ex21Aid {
//!    @Override
//!    public void fun(){
//!
//!    }

    public static void main(String[] args) {
        Ex21 ex21 = new Ex21();
        ex21.fun();
    }
}
class Ex21Aid{
    public final void fun(){

    }
}
