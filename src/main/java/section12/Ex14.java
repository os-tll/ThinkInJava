package section12;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/22 16:38
 */
public class Ex14 {
    public static void main(String[] args) {
        new Ex14().test();
    }
    private void test(){
        try{
            throw new NullPointerException();
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("catch in");
        }
    }
}
