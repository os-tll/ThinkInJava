package section7;

/**
 * 继承的初始化顺序
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/28 13:36
 */
public class Ex3 extends Ex3Aid2{
    Ex3(){
        System.out.println("Ex3");
    }
    public static void main(String[] args) {
        new Ex3();
    }
}
class Ex3Aid{
}
class Ex3Aid2 extends  Ex3Aid{
    Ex3Aid2(){
        System.out.println("Ex3Aid2");
    }
}