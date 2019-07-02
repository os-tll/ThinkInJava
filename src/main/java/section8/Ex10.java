package section8;

/**
 * 子类有实现，优先用子类的
 * @author tanglonglong
 * @version 1.0
 * @date 2019/7/1 14:17
 */
public class Ex10 {
    public static void main(String[] args) {
        Ex10Aid ex10Aid = new Ex10Aid2();
        ex10Aid.fun1();
    }
}
class Ex10Aid{
    int i = 0;
    public void fun1(){
        fun2();
    }
    public void fun2(){
        System.out.println("Ex10Aid:fun2-"+i);
    }
}
class Ex10Aid2 extends Ex10Aid{
    int i = 1;
    @Override
    public void fun2(){
        System.out.println("Ex10Aid2:fun2-"+i);
    }
}
