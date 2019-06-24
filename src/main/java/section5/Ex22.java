package section5;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/24 13:40
 */
public class Ex22 {
    public static void main(String[] args) {
        Money[] values = Money.values();
        for (Money m : values){
            switch (m){
                case ONE:
                    System.out.println("1元");
                    break;
                case TWO:
                    System.out.println("2元");
                    break;
                case FIVE:
                    System.out.println("5元");
                    break;
                default:
                    System.out.println("钱太大了，没见过~~");
            }
        }
    }
}
