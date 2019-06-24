package section5;

/**
 * 通过语句一和语句二验证静态数据的初始化
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/24 10:35
 */
public class Ex13 {

    public static void main(String[] args) {
    // 语句一
    // Cups.cup1.f(2);
    }
    //语句二
    static Cups cups = new Cups();
}
class Cup{
    Cup(int marker){
        System.out.println("Cup:"+marker);
    }
    void f(int marker){
        System.out.println("f:"+marker);
    }
}
class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups(){
        System.out.println("Cups");
    }
}
