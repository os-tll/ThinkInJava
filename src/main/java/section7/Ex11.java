package section7;

/**
 * 使用静态代理模式
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/28 14:44
 */
public class Ex11 {
    public static void main(String[] args) {
        Ex11 ex11 = new Ex11();
        ex11.fun1();
        ex11.fun2();
        ex11.fun3();
    }
    Ex11Aid ex11Aid = new Ex11Aid();
    public void fun1(){
        System.out.println("proxy");
        ex11Aid.fun1();
    }
    public void fun2(){
        System.out.println("proxy");
        ex11Aid.fun2();
    }
    public void fun3(){
        System.out.println("proxy");
        ex11Aid.fun3();
    }

}
class Ex11Aid{
    protected void fun1(){
        System.out.println(" Ex11Aid fun1 ");
    }
    protected void fun2(){
        System.out.println("Ex11Aid fun2 ");
    }
    protected void fun3() {
        System.out.println(" Ex11Aid fun3 ");
    }
}
