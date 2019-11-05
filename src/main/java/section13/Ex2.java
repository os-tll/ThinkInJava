package section13;

import java.util.ArrayList;
import java.util.Objects;

/**
 * 打印地址
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/9/30 14:32
 */
public class Ex2 {
    @Override
    public String toString() {
        return "Address is "+ super.toString();
    }

    public static void main(String[] args) {
        ArrayList<Ex2> ex2s = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ex2s.add(new Ex2());
        }
        System.out.println(ex2s);
    }
}
