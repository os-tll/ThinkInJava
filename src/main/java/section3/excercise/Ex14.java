package section3.excercise;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/20 21:08
 */
public class Ex14 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        new Ex14().compare("abc", "abc");
        new Ex14().compare(s1, s2);
    }

    /**
     * 比较两字符串是否相同
     * @param arg1
     * @param arg2
     */
    public void compare(String arg1, String arg2){
        System.out.println(arg1 == arg2);
        System.out.println(arg1 != arg2);
        System.out.println(arg1.equals(arg2));
    }

}
