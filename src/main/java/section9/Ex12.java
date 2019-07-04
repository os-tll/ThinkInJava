package section9;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/4 14:37
 */
public class Ex12 {
    public static void main(String[] args) {
        Ex12 ex12 = new Ex12();
        Hero hero = new Hero();
        ex12.fight(hero);
        ex12.eat(hero);
        ex12.fly(hero);
    }
    public void fight(CanFight canFight){
        canFight.fight();
    }
    public void eat(CanEat canEat){
        canEat.eat();
    }
    public void fly(CanFly canFly){
        canFly.fly();
    }
}
interface CanFight{
    void fight();
}
interface CanFly{
    void fly();
}
interface CanEat{
    void eat();
}
class ActionCharacter{
    public void fight(){

    }
}

class Hero extends ActionCharacter implements CanFight,CanEat,CanFly{

    @Override
    public void fly() {

    }

    @Override
    public void eat() {

    }
}