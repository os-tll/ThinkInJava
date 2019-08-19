package section11;

import java.util.*;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/10 10:16
 */
public class Ex19 {

    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        Collections.addAll(strings,"1","12","21","22");
        System.out.println(strings);

        //插入到LinkedHashSet中,按照散列码进行排序
        String[] strings1 = new String[strings.size()];
        strings.toArray(strings1);
        Arrays.sort(strings1);
        LinkedHashSet<String> hashSet = new LinkedHashSet<>(Arrays.asList(strings1));
        System.out.println(hashSet);
    }
}
