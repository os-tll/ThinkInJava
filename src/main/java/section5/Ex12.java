package section5;

import lombok.Data;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/23 17:50
 */
public class Ex12 {
    public static final String EMPTY = "empty";
    public static final String FULL = "full";

    public static void main(String[] args) {
        new Tank().setFlag(Ex12.FULL);
        new Tank().setFlag(Ex12.FULL);
        new Tank();
        System.gc();
    }

}
@Data
class Tank{
    private String flag = Ex12.EMPTY;
    @Override
    protected void finalize() {
        if(flag.equals(Ex12.FULL)){
            System.out.println("FULL");
            throw new RuntimeException("flag is full");
        }
    }
    int[] x = new int[Integer.MAX_VALUE/10];
}
