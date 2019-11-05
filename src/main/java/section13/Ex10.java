package section13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则验证使用
 *
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/10/1 16:25
 */
public class Ex10 {
    private static String str = "Java now  has regular expression";
    //从字符串开始进行匹配Java字符串
    Pattern pattern1 = Pattern.compile("^Java");
    //从非词边界开始匹配reg.*
    Pattern pattern2 = Pattern.compile("\\Breg.*");
    //字符n和任意字符和字符w和一个或多个空白符和字符h和字符a或i和字符s
    Pattern pattern3 = Pattern.compile("n.w\\s+h(a|i)s");
    //一个或零个字符s
    Pattern pattern4 = Pattern.compile("s?");
    //零个或多个字符s
    Pattern pattern5 = Pattern.compile("s*");
    //一个或多个字符
    Pattern pattern6 = Pattern.compile("s+");
    //字符s出现4次
    Pattern pattern7 = Pattern.compile("s{4}");
    //字符s出现1次和一个任意字符
    Pattern pattern8 = Pattern.compile("s{1}.");
    //字符s出现0次到3次
    Pattern pattern9 = Pattern.compile("s{0,3}");

    public static void main(String[] args) {
        Ex10 ex10 = new Ex10();
        Matcher matcher1 = ex10.pattern1.matcher(str);
        while (matcher1.find()) {
            String group = matcher1.group();
            System.out.println("matcher1 position is " + matcher1.start() + ", " + matcher1.end() + "  match string is " + group);
        }
        Matcher matcher2 = ex10.pattern2.matcher(str);
        while (matcher2.find()) {
            String group = matcher2.group();
            System.out.println("matcher2 position is " + matcher2.start() + ", " + matcher2.end() + "  match string is " + group);
        }
        Matcher matcher3 = ex10.pattern3.matcher(str);
        while (matcher3.find()) {
            String group = matcher3.group();
            System.out.println("matcher3 position is " + matcher3.start() + ", " + matcher3.end() + "  match string is " + group);
        }
        Matcher matcher4 = ex10.pattern4.matcher(str);
        while (matcher4.find()) {
            String group = matcher4.group();
            System.out.println("matcher4 position is " + matcher4.start() + ", " + matcher4.end() + "  match string is " + group);
        }
        Matcher matcher5 = ex10.pattern5.matcher(str);
        while (matcher5.find()) {
            String group = matcher5.group();
            System.out.println("matcher5 position is " + matcher5.start() + ", " + matcher5.end() + "  match string is " + group);
        }
        Matcher matcher6 = ex10.pattern6.matcher(str);
        while (matcher6.find()) {
            String group = matcher6.group();
            System.out.println("matcher6 position is " + matcher6.start() + ", " + matcher6.end() + "  match string is " + group);
        }
        Matcher matcher7 = ex10.pattern7.matcher(str);
        while (matcher7.find()) {
            String group = matcher7.group();
            System.out.println("matcher7 position is " + matcher7.start() + ", " + matcher7.end() + "  match string is " + group);
        }
        Matcher matcher8 = ex10.pattern8.matcher(str);
        while (matcher8.find()) {
            String group = matcher8.group();
            System.out.println("matcher8 position is " + matcher8.start() + ", " + matcher8.end() + "  match string is " + group);
        }
        Matcher matcher9 = ex10.pattern9.matcher(str);
        while (matcher9.find()) {
            String group = matcher9.group();
            System.out.println("matcher9 position is " + matcher9.start() + ", " + matcher9.end() + "  match string is " + group);
        }
    }
}
