package section3.excercise;

import java.util.Random;

/**
 * 模拟扔1000次硬币
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/19 21:13
 */
public class Ex7 {
    public static void main(String[] args) {
        int front = 0;
        int back = 0;
        Random random = new Random(47);
        int loop = 1000;
        while (loop-- > 0){
            float i = random.nextFloat();
            boolean backFlag = i > 0.5f;
            if(backFlag){
                back++;
            }else {
                front++;
            }
        }
                System.out.println("front:"+front);
    }
}
