package section7;

/**
 * 继承时向上转型
 *
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/28 16:40
 */
public class Ex16 extends Ex16Aid {
    public static void main(String[] args) {
        Ex16Aid ex16Aid = new Ex16();
        ex16Aid.sout();
    }
}
class Ex16Aid{
    protected int sout(){
        System.out.println("````");
        return 1;
    }
}
