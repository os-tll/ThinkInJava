package section4;

/**
 * 比较数值
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/22 14:28
 */
public class Ex6 {
    /**
     * 判断数值是否区间内 大于1 区间内0 小于-1
     * @param i 数值
     * @param begin 区间开始
     * @param end 区间结束
     * @return int
     * @author tanglonglong
     * @date 14:36 2019/6/22
     */
    private int compareNum(int i, int begin, int end){
        if(i > end){
            return 1;
        }
        if (i < begin){
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        args = new String[3];
        args[0] = "9";
        args[1] = "3";
        args[2] = "8";
        Integer i = Integer.valueOf(args[0]);
        Integer begin = Integer.valueOf(args[1]);
        Integer end = Integer.valueOf(args[2]);
        int compare = new Ex6().compareNum(i, begin, end);
        System.out.println("compare:"+compare);
    }
}
