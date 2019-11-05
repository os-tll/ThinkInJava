package exercise;

import java.util.Optional;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/9/29 11:21
 */
public class OptionalExec {
    public static void main(String[] args) {
        String s = new String("234e");
        String ss = null;
        Optional<String> s1 = Optional.ofNullable(ss);
        System.out.println(s1.get());
    }
}
class OptionalExecAid {
    public OptionalExecAid(){}
}
