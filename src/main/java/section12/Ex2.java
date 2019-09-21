package section12;

import java.util.List;

/**
 * 构造一个空指针异常
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/21 14:51
 */
public class Ex2 {
    public static void main(String[] args) {
        try{
            List list = null;
            list.size();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("sdfsaf");
    }
}
