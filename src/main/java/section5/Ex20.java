package section5;

/**
 * 使用可变长main代替数组main
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/24 13:30
 */
public class Ex20 {
    public static void main(String... args) {
        for(String str : args){
            System.out.println(str);
        }
    }
}
