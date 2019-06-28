package section7;

/**
 * 使用带参的构造器来初始化基类
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/28 14:03
 */
public class Ex7 {
    public static void main(String[] args) {
        Ex7Aid3 ex7Aid3 = new Ex7Aid3();
        ex7Aid3.fun();
    }
}
class Ex7Aid{
    Ex7Aid(int i){
        System.out.println(i);
    }
}
class Ex7Aid2{
    Ex7Aid2(int i){
        System.out.println(i);
    }
}
class Ex7Aid3 extends Ex7Aid{
    Ex7Aid3(){
        super(1);
    }
    public void fun(){
        new Ex7Aid2(12);
    }
}
