package section12;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/22 16:41
 */
public class Ex15 {
    public static void main(String[] args) {
        new Ex15().test();
    }
    private void test(){
        try{
            throw new NullPointerException();
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("catch in");
        }finally {
            System.out.println("finally in");
        }
    }
}
