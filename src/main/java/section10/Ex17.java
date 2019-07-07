package section10;

import java.util.Random;

/**
 * 工厂模式，掷硬币和抛骰子
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/4 16:52
 */
public class Ex17 {
    CastSomethingFactory castSomethingFactory;
    public static void main(String[] args) {
        new Factories2(CastCoin.castSomethingFactory).callCastSomething();
        new Factories2(CastDice.castSomethingFactory).callCastSomething();
    }
}
interface CastSomething{
    void cast();
}
interface CastSomethingFactory{
    CastSomething castWhat();
}
class CastCoin implements CastSomething {

    @Override
    public void cast() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int f = random.nextInt(2);
            System.out.println("Cast coin, "+f);
        }
    }
    static public CastSomethingFactory castSomethingFactory = new CastSomethingFactory(){
        @Override
        public CastSomething castWhat() {
            return new CastCoin();
        }
    };
}
class CastDice implements CastSomething {

    @Override
    public void cast() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int f = random.nextInt(6);
            System.out.println("Cast Dice "+f);
        }
    }
    static public CastSomethingFactory castSomethingFactory = new CastSomethingFactory(){
        @Override
        public CastSomething castWhat() {
            return new CastDice();
        }
    };
}
class Factories2 {
    private CastSomethingFactory castSomethingFactory;
    Factories2(CastSomethingFactory castSomethingFactory){
        this.castSomethingFactory = castSomethingFactory;
    }
    public void callCastSomething(){
        castSomethingFactory.castWhat().cast();
    }
}