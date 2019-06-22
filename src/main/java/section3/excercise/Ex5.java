package section3.excercise;

/**
 * 对象等价性
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/19 20:52
 */
public class Ex5 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "spot";
        dog1.says = "Ruff!";
        Dog dog2 = new Dog();
        dog2.name = "scruffy";
        dog2.says = "Wurf!";
        System.out.println(dog1.name+":"+dog1.says);
        System.out.println(dog2.name+":"+dog2.says);
    }
}
class Dog{
    String name;
    String says;
    @Override
    public boolean equals(Object d1){
        Dog dog = (Dog)d1;
        if((this.name == dog.name) && (this.says == dog.says)){
            return true;
        }
        return false;
    }
}
