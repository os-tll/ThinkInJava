package section7;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/7/1 10:41
 */
public class Ex24 extends Ex24Aid2{
    public static void main(String[] args) {
        Ex24Aid2 ex24Aid2 = new Ex24Aid2();
    }
} //sout: static Ex24Aid initialized
//static Ex24Aid2 initialized
//i = 9, j = 0
//Ex24Aid2 initialized
//k = 47, j = 39

class Ex24Aid{
    private int i = 9;
    protected int j;
    Ex24Aid(){
        System.out.println("i = "+i+", j = " + j);
        j = 39;
    }
    private static int x1= print("static Ex24Aid initialized");
    static int print(String s){
        System.out.println(s);
        return 47;
    }
}
class Ex24Aid2 extends Ex24Aid{
    private int k = print("Ex24Aid2 initialized");
    public Ex24Aid2(){
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = print("static Ex24Aid2 initialized");
}
