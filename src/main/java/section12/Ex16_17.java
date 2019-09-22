package section12;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/22 16:52
 */
public class Ex16_17 {
    public static void main(String[] args) {
        try{
           return;
        }finally {
            System.out.println("即使return,也可以执行到finally");
        }
    }
}
