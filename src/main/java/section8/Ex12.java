package section8;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/7/1 16:39
 */
public class Ex12 extends Amphibian{
    Characteristic characteristic = new Characteristic("Croaks");
    Description description = new Description("Eats bugs");
    public Ex12(){
        System.out.println("Ex12");
    }
    @Override
    protected void dispose(){
        System.out.println("Ex12 dispose");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        new Ex12().dispose();
    }
}
class Characteristic{
    private String s;
    Characteristic(String s){
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }
    protected void dispose(){
        System.out.println("disposing Description " + s);
    }
}
class Description{
    private String s;
    Description(String s){
        this.s = s;
        System.out.println("Creating Description " + s);
    }
    protected void dispose(){
        System.out.println("disposing Description " + s);
    }
}

class LivingCreature{
    private Characteristic characteristic = new Characteristic("is alive");
    private Description description = new Description("Basic Living Creature");
    LivingCreature(){
        System.out.println("LivingCreature()");
    }
    protected void dispose(){
        System.out.println("LivingCreature dispose");
        description.dispose();
        characteristic.dispose();
    }
}

class Animal extends LivingCreature{
    private Characteristic characteristic = new Characteristic("has heart");
    private Description description = new Description("Animal not Vegetable");
    Animal(){
        System.out.println("Animal()");
    }
    @Override
    protected void dispose(){
        System.out.println("Animal Dispose");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}
class Amphibian extends Animal{
    Characteristic characteristic = new Characteristic("can not live in water");
    Description description = new Description("Both water and land");
    Amphibian(){
        System.out.println("Amphibian()");
    }
    @Override
    protected void dispose(){
        System.out.println("Amphibian dispose");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}