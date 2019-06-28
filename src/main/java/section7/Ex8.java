package section7;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/28 14:18
 */
public class Ex8 extends Ex8Aid {
    Ex8(){
        super(1);
    }
    Ex8(int i){
        super(123);
    }
    public static void main(String[] args) {
        new Ex8();
        new Ex8(111);
    }
}
class Ex8Aid{
    Ex8Aid(int i){
        System.out.println(i);
    }

}
