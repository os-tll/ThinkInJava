package section5;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/24 13:17
 */
public class Ex19 {
    public void fun(Object... objects){
        for (Object object : objects){
            System.out.println(object);
        }
    }

    public static void main(String[] args) {
        Ex19 ex19 = new Ex19();
        ex19.fun("111", "222", "333");
        String[] strings = {"1111", "2222", "3333"};
        ex19.fun(strings);
    }

}
