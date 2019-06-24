package section4;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/22 14:44
 */
public class Ex7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if(i == 99){
               return;
            }
            System.out.println(i);
        }
    }
}
