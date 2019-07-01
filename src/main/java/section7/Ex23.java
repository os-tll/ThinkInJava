package section7;

/**
 * 验证类的加载动作只发生一次
 * @author tanglonglong
 * @version 1.0
 * @date 2019/7/1 10:33
 */
public class Ex23 {
    public static void main(String[] args) {
//        int num = Ex23Aid.num;
        new Ex23Aid();
    }
}
class Ex23Aid{
    static int num;
    static {
        int i = 0;
        System.out.println(num);
    }
    Ex23Aid(){
        System.out.println("initialize");
    }
}
