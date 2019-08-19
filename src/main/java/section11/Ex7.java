package section11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 联系List的使用
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/8 13:27
 */
public class Ex7 {
    public static void main(String[] args) {

        Ex7Aid[] ex7Aids = {new Ex7Aid(20), new Ex7Aid(3),new Ex7Aid(7)};
        List<Ex7Aid> ex7AidList = new ArrayList<>(Arrays.asList(ex7Aids));
        ArrayList<Ex7Aid> ex7AidArrayList = new ArrayList<>(ex7AidList.subList(1, 2));
        ex7AidList.removeAll(ex7AidArrayList);
        System.out.println(ex7AidList);
    }
}
class Ex7Aid{
    private int i;
    Ex7Aid(int i){
        this.i = i;
    }
    public int getI(){
        return i;
    }

    @Override
    public String toString() {
        return ""+i;
    }
}
