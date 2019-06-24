package section5;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/24 13:35
 */
public class Ex21 {
    public static void main(String[] args) {
        Money[] values = Money.values();
        for (Money money : values){
            //获得定义的先后顺序，并打印
            int ordinal = money.ordinal();
            System.out.println("ordianl:"+money+ordinal);
        }
    }
}
enum Money{
    ONE,
    TWO,
    FIVE,
    TEN,
    TWENTY,
    FIFTY,
    HUNDRED
}
