package section13;

import java.util.regex.Pattern;

/**
 * String.format的用法
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/9/30 17:26
 */
public class Ex6 {
    public static void main(String[] args) {
        System.out.println(new Ex6Aid());
    }
}
class Ex6Aid {
    private int a = 100;
    private long b = 111L;
    private float c = 23f;
    private double d = 333;

    @Override
    public String toString(){
       return String.format("a is %10d,\nb is %10d,\nc is %10.5f,\nd is %10.5f",a,b,c,d);
    }
}
