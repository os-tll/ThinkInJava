package section12;

/**
 * "恢复模型处理异常"
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/21 16:09
 */
public class Ex5 {
    public static void main(String[] args) {
        String str = "1";

        while (true) {
            try {
                if (str.length() < 5) {
                    throw new Exception();
                } else {
                    break;
                }
            } catch (Exception e) {
                str += "1";
            }
        }
    }
}
