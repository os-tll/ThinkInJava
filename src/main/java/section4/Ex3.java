package section4;

import java.util.Arrays;
import java.util.Random;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/21 10:08
 */
public class Ex3 {
    public static void main(String[] args) {
        Random random = new Random(47);
        int loop = 25;
        int[] intArray = new int[loop];
        for (int i = 0;i < loop; i++){
            intArray[i] = random.nextInt(10);
        }
        while (true){
            System.out.println(Arrays.toString(intArray));
            new Ex2().classify(intArray);
        }
    }
}
