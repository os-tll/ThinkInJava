package section7;

/**
 * 继承时即使向上转型，子类有覆盖，用子类。没有才会用父类。
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/28 16:45
 */
public class Ex17 extends Ex17Aid{
    @Override
    protected int sout(){
        System.out.println("--__--");
        return 2;
    }

    public static void main(String[] args) {
        Ex17Aid ex17Aid =new Ex17();
        ex17Aid.sout();
    }
}
class Ex17Aid{
    protected int sout(){
        System.out.println("--^^--");
        return 1;
    }
}
