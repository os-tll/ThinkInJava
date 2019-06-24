package section5;

/**
 * 验证静态域的初始化
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/24 10:43
 */
public class Ex14 {
    {
        System.out.println();
    }
    static String str1 = "123";
    static String str2;
    static {
        str2 = "234";
    }

    public static void main(String[] args) {
        System.out.println(str1);
        System.out.println(str2);
    }
}
