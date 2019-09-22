package section12;

import java.util.List;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/22 11:05
 */
public class Ex8 {

    public static void main(String[] args) {
        Ex8 ex8 = new Ex8();
        try {
            ex8.exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void exception() throws Exception{
        throw new Ex4AidException("Ex8");
    }
}