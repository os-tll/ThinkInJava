package section8;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/7/1 16:39
 */
public class Ex14 extends Amphibian{
    Characteristic characteristic = new Characteristic("Croaks");
    Description description = new Description("Eats bugs");
    public Ex14(){
        System.out.println("Ex14");
    }
    @Override
    protected void dispose(){
        System.out.println("Ex14 dispose");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        new Ex12().dispose();
    }
}
class Characteristic1{
    private String s;
    Characteristic1(String s){
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }
    protected void dispose(){
        System.out.println("disposing Description " + s);
    }
}
class Description1{
    private String s;
    Description1(String s){
        this.s = s;
        System.out.println("Creating Description " + s);
    }
    protected void dispose(){
        System.out.println("disposing Description " + s);
    }
}

class LivingCreature1{
    private int count = 0;

    public void setCount() {
        this.count++;
    }
    public int getCount() {
        return this.count;
    }

    private Characteristic1 characteristic = new Characteristic1("is alive");
    private Description1 description = new Description1("Basic Living Creature");
    LivingCreature1(){
        System.out.println("LivingCreature()");
    }
    protected void dispose(){
        System.out.println("LivingCreature dispose");
        description.dispose();
        characteristic.dispose();
        count--;
    }
}

class Animal1 extends LivingCreature1{
    private Characteristic1 characteristic = new Characteristic1("has heart");
    private Description1 description = new Description1("Animal not Vegetable");
    Animal1(){
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
class Amphibian1 extends Animal1{
    Characteristic1 characteristic = new Characteristic1("can not live in water");
    Description1 description = new Description1("Both water and land");
    Amphibian1(){
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