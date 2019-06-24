package section5;

/**
 * 重载构造器
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/23 15:39
 */
public class Ex4 {
    Ex4(){}
    Ex4(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        new Ex4("123");
    }
}
