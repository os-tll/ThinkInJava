package section3.excercise;

/**
 * 测试equals和 ==
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/19 20:57
 */
public class Ex6 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "spot";
        dog1.says = "Ruff!";
        Dog dog2 = new Dog();
        dog2.name = "spot";
        dog2.says = "Ruff!";
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));
    }
}
