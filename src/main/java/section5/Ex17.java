package section5;

/**
 * 定义引用对象
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/24 11:34
 */
public class Ex17 {
    public static void main(String[] args) {
        //此处只是存放起来了引用，并没有实际的去新建
        TestEx17[] testEx17s = new TestEx17[10];
    }
}

class TestEx17 {
    TestEx17(String s){
        System.out.println(s);
    }
}
