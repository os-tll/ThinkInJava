package section12;

/**
 * 捕获ArrayIndexOutOfBoundsException
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/21 15:04
 */
public class Ex3 {
    public static void main(String[] args) {
        int[] ints = new int[1];
        try {
            System.out.println(ints[2]);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
