package section11;

import java.util.*;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/8 9:27
 */
public class Ex4 {
    public static void main(String[] args) {
        String[] strArray = new String[5];
        ArrayList<String>  strArrayList = new ArrayList<>();
        LinkedList<String> strLinkedList = new LinkedList<>();
        HashSet<String> stringHashSet = new HashSet<>();
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
        TreeSet<String> stringTreeSet = new TreeSet<>();

        Ex4Aid ex4Aid = new Ex4Aid();
        for (int i = 0; i < 5; i++) {
            String next = ex4Aid.next();
            strArray[i] = next;
            strArrayList.add(next);
            strLinkedList.add(next);
            stringHashSet.add(next);
            stringLinkedHashSet.add(next);
            stringTreeSet.add(next);
        }
        System.out.println(Arrays.toString(strArray));
        strArrayList.indexOf(strArrayList.get(4));
        System.out.println(strArrayList);
        System.out.println(strLinkedList);
        System.out.println(stringHashSet);
        System.out.println(stringLinkedHashSet);
        System.out.println(stringTreeSet);
    }
}
class Ex4Aid{
    String[] str = {"Tom","Jone","Jerry","Atom"};
    int i = 0;
    public String next(){
        return str[(i++)%4];
    }
}