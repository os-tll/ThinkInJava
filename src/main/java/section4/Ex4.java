package section4;

/**
 * 素数1000以内
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/21 10:32
 */
public class Ex4 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    break;
                }
                if(j == i - 1){
                    System.out.println(i);
                }
            }
        }
    }
}
