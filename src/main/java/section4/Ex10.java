package section4;

import java.util.*;

/**
 * 找出 ‘吸血鬼’ 数字
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/22 15:40
 */
public class Ex10 {
    /**
     * 吸血鬼数字
     *
     * 1. 共有偶数位
     * 2. 可以由A*B组成
     * 3. A，B各占偶数位中的一半数字
     * 4. A为此一办数字随意排列，B中数字的顺序与原数字先后顺序一致
     * 5. 不含结尾为00的数字
     * @param maxValue 从0 到 maxValue
     * @return void
     * @author tanglonglong
     * @date 15:42 2019/6/22
     */
    public void vampire(int maxValue){

        //存放各个位
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while ( i++ < maxValue){
            //取出各个位数
            while (true){
                list.add( maxValue % 10 );
                maxValue/=10;
                if(maxValue == 0){
                    break;
                }
            }
            //1. 共有偶数位
            int bits = list.size();
            //判断是否是偶数
            if ((bits & 0x1) == 1){
                continue;
            }
            //5. 不含结尾为00的数字
            if (maxValue % 100 == 0){
                continue;
            }
            //2.可以由A*B组成
            //FIXME:排列组合算法
        }
    }
}
