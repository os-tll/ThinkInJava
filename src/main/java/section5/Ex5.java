package section5;

/**
 * 重载方法
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/23 15:41
 */
public class Ex5 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark('2');
        dog.bark("ss");

    }

}
class Dog{
    public void bark(char c){
        System.out.println("W~W~W!");
    }
    public void bark(String str){
        System.out.println("Wow~Wow~Wow!");
    }
    public void bark(char c, String str){
        System.out.println("W~W~W!");
    }
    public void bark(String str, char c){
        System.out.println("Wow~Wow~Wow!");
    }
}
