package section13;

/**
 *
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/10/1 14:29
 */
public class Ex9 {
    public static String knights = "The, when you have found the shrubbery," +
            " you must cut down the mightiest tree in the forest... " +
            "with... a herring!";

    public static void main(String[] args) {
//        String all = knights.replaceAll("a|e|i|o|u|A|E|I|O|U", "_");
        String all = knights.replaceAll("[aeiouAEIOU]", "_");
        System.out.println(all);
    }
}
