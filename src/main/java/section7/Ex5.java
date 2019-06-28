package section7;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/28 13:45
 */
public class Ex5 {
    public static void main(String[] args) {
        new Ex5Aid3().callEx5Aid2();
    }
}
class Ex5Aid{
    Ex5Aid(){
        System.out.println("Ex5Aid");
    }
}
class Ex5Aid2{
    Ex5Aid2(){
        System.out.println("Ex5Aid2");
    }
}
class Ex5Aid3 extends Ex5Aid{
    public void callEx5Aid2(){
        Ex5Aid2 ex5Aid2 = new Ex5Aid2();
    }
}