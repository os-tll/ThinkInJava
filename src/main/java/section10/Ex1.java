package section10;

/**
 * 外部类调用内部类
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/5 9:35
 */
public class Ex1 {

    public Ex1Aid fun(){
        return new Ex1Aid();
    }

    public static void main(String[] args) {
        //静态类中创建外部类方法1
        Ex1Aid fun = new Ex1().fun();
        //静态类中创建外部类方法2
        Ex1 ex1 = new Ex1();
        ex1.new Ex1Aid();
    }
    class Ex1Aid{
    }
}
