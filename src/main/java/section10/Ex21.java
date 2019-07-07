package section10;

/**
 * 接口中嵌套内部类调用接口的方法
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/7 11:04
 */
public class Ex21 implements Ex21Aid{

    @Override
    public void fun() {
        System.out.println("123");
    }

    public static void main(String[] args) {
        Ex21Aid2.callFun(new Ex21());
    }
}
interface Ex21Aid{
    void fun();
    class Ex21Aid2{
        public static void callFun(Ex21Aid ex21Aid){
            ex21Aid.fun();
        }
    }
}
