package section11;


import java.util.*;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/10 17:03
 */
public class Ex30 {
    Ex30Aid[] ex30Aids = new Ex30Aid[]{
            new Ex30Aid(), new Ex30Aid(), new Ex30Aid(),
            new Ex30Aid(), new Ex30Aid(), new Ex30Aid(),
            new Ex30Aid(), new Ex30Aid(), new Ex30Aid()};
    public Iterator<Ex30Aid> iterator() {
    String [] s = {"aa","ddd"};
        for (String ss: s ) {

        }
        return new Iterator<Ex30Aid>() {
            int i = 0;

            @Override
            public boolean hasNext() {
                return ex30Aids.length > i;
            }

            @Override
            public Ex30Aid next() {
                return ex30Aids[i++];
            }
        };
    }

}
class Ex30Aid{
    public static void main(String[] args) {
        Iterator<Ex30Aid> iterator = new Ex30().iterator();
        while (iterator.hasNext()){
            Ex30Aid ex30aid = iterator.next();
            System.out.println(ex30aid);
        }
    }

}