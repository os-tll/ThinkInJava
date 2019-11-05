package section12;

import java.io.FileNotFoundException;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/9/29 17:55
 */
public class Ex30 {
    public static void main(String[] args) {
        try {
            new Ex30Aid().fun();
        } catch (RuntimeException e) {
            try {
                throw e.getCause();
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }
}

class Ex30Aid extends Exception {
    public void fun() {
        try {
            throw new FileNotFoundException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}