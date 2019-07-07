package section10;

/**
 * 接口中嵌套内部类中方法的调用
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/7 10:58
 */
public class Ex20 implements Ex20Aid{
    public static void main(String[] args) {
        //TODO:内部类究竟是否能被继承
        Ex20Aid2 ex20Aid2 = new Ex20Aid2();
        ex20Aid2.fun();
    }
}
interface Ex20Aid{
    class Ex20Aid2{
        public void fun(){
            System.out.println("123");
        }
    }
}
