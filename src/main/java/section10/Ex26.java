package section10;

/**
 * 内部类的继承
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/7 16:01
 */
public class Ex26 {
    class Ex26Aid3 extends Ex26Aid.Ex26Aid2 {
        //关键在这个构造器，需要提供外部类的引用。使用super调用内部类的构造以传进进去。
        Ex26Aid3(Ex26Aid ex26Aid) {
            ex26Aid.super(1);
        }
    }
}
class Ex26Aid{
    class Ex26Aid2{
        Ex26Aid2(int i){
            System.out.println("Ex26Aid2 initialize");
        }
    }
}