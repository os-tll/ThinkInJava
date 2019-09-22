package section12;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/22 16:31
 */
public class Ex13 {
    public static void main(String[] args) {
        new Ex13().s();
    }
    private void s(){
        try{
            throw new Ex13AidException();
        }catch (Ex13AidException e){
            throw new NullPointerException();
        }finally{
            System.out.println("finally execute");
        }
    }
}
class Ex13AidException extends RuntimeException{}
