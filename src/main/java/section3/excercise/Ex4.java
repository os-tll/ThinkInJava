package section3.excercise;

import java.util.Random;

/**
 * 计算速度-熟悉运算符
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/19 20:26
 */
public class Ex4 {
    public static void main(String[] args) {
        int loop = 10;
        //定义随机数种子。对于确定的种子，总是产生相同的随机数序列
        /*以下代码输出结果
        20.774734
        12.949888
        5.524364
        9.423933
        73.80029
        5.5805454
        5.3338976
        0.8770227
        803.7155
        13.139078
         */
        Random random = new Random(47);

        while (loop-- > 0){

            //距离（m)
            float m = random.nextFloat() * 1000;
            //时间 (s)
            float t = random.nextInt(60);
            //速度(m/s)
            float v = m / t;
            System.out.println(v);
        }
    }
}
