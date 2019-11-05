package section13;
import java.util.regex.Matcher;
import	java.util.regex.Pattern;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/10/1 17:13
 */
public class Ex11 {
    // ate e
    // apple
    // and o
    // ora

    private static String str = "Arline ate eight apples and one orange while Anita hadn't any";
    //零个或者一个字符i 和 非aeiou开头 或者 一个或者多个空白字符 和 aeiou字符 和 勉强型零或一个词字符（a-zA-Z0-9） 和 aeiou字符非词边界
    static Pattern p = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
    public static void main(String[] args) {
        Matcher matcher = p.matcher(str);
        while(matcher.find()){
            System.out.println("start is "+matcher.start()+" end is "+ matcher.end() + "  " +matcher.group());

        }
    }
}
