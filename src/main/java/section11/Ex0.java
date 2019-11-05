package section11;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/7 17:34
 */
public class Ex0 {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5,6};
        String arrStr[] = {"1","2"};
        List<Integer> list = Arrays.asList(arr);
        //说明底层是数组，不可修改长度（增，删）
        //! list.add(0);
        //再次进行封装就可以了
        List<Integer> list2 = new ArrayList<>(list);
        list2.add(0);
        System.out.println(list2);

        //collection工具类自带的addAll，不定长参
        List<String> list3 = new ArrayList<>();
        Collections.addAll(list3,arrStr);

    }
}
