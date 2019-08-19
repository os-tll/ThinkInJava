package section11;

import java.util.*;

/**
 * 题意是要判断数字出现次数多少，然后按照次数进行排序
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/11 17:08
 */
public class Ex23 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new Ex23().getMap();
        ArrayList<Ex23Aid> ex23Aids = new ArrayList<>();
        map.forEach((key,value)->{
            ex23Aids.add(new Ex23Aid(key, value));
        });
        Collections.sort(ex23Aids);
        System.out.println(ex23Aids);
    }
    private Map getMap(){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Random random = new Random(47);
        int i = 100000;
        while (i-- > 0){
            int num = random.nextInt(20);
            Integer integer = hashMap.get(num);
            hashMap.put(num, integer == null ? 1 : integer+1);
        }
        return hashMap;
    }

}
class Ex23Aid implements Comparable{
    int num;
    int count;
    Ex23Aid(Integer num,Integer count){
        this.num = num;
        this.count = count;
    }

    @Override
    public int compareTo(Object o) {
         if (this.count == ((Ex23Aid)o).count){
            return 0;
         }
         return this.count > ((Ex23Aid)o).count ? 1 : -1;
    }
    @Override
    public String toString(){
        return "\nnum"+num+","+"count"+count;
    }
}

