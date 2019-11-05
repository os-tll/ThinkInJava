package section13;
import	java.util.Scanner;

/**
 * 正则匹配大写字母开头，句号结尾的句子。
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/10/1 13:44
 */
public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        //^[A-Z] 大写字母开头  (.*) 匹配中间的字符    \.$ 以字符.结尾
        boolean matches = s.matches("^[A-Z](.*)\\.$");
        // \p{javaUpperCase} 大写字母
        boolean matches1 = s.matches("\\p{javaUpperCase}.*\\.");
        System.out.println(matches);
    }
}
