package section5;

/**
 * 构造器间用this调用
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/23 16:23
 */
public class Ex9 {
    Ex9(){
        System.out.println("default");
    }
    Ex9(String str){
        this();
        System.out.println(str);
    }

    public static void main(String[] args) {
        new Ex9("123");
    }

}
