package section12;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/9/29 17:16
 */
public class Ex27 {
    public static void main(String[] args) {
        int[] ints = new int[1];
        try {
            System.out.println(ints[2]);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
