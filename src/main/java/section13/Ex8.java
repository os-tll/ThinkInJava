package section13;

import java.util.Arrays;

/**
 * 在the和you处进行分割
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/10/1 14:22
 */
public class Ex8 {
    public static String knights = "The, when you have found the shrubbery," +
            " you must cut down the mightiest tree in the forest... " +
            "with... a herring!";

    public static void main(String[] args) {
        String[] split = knights.split("the|you");
        String string = Arrays.toString(split);
        System.out.println(string);
    }
}
