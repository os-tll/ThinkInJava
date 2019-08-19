package section11;

import java.util.HashSet;

/**
 * 熟悉set
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/7 17:11
 */
public class Ex2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < 10; i++){
            set.add(i);
        }
        for(Integer i : set){
            System.out.println(i);
        }
    }
}
