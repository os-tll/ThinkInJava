package section5;

/**
 * 参数列表重载
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/23 15:46
 */
public class Ex6 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark('c',"cc");
        dog.bark("cc",'c');
    }
}
