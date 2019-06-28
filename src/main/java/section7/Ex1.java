package section7;

/**
 * 惰性初始化
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/28 10:52
 */
public class Ex1 {
    Ex1Aid ex1Aid;

    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        if(ex1.ex1Aid == null){
            System.out.println("lazy install");
            ex1.ex1Aid = new Ex1Aid();
        }
    }
}
class Ex1Aid{

}
