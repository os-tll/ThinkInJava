package section9;

import java.util.Random;

/**
 * 工厂模式，掷硬币和抛骰子
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/4 16:52
 */
public class Ex19 {
    CastSomethingFactory castSomethingFactory;
    public static void main(String[] args) {
        new CastCoinFactory().castWhat().cast();
        new CastDiceFactory().castWhat().cast();
    }
}
interface CastSomething{
    void cast();
}
interface CastSomethingFactory{
    CastSomething castWhat();
}
class CastCoin implements CastSomething{

    @Override
    public void cast() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int f = random.nextInt(2);
            System.out.println("Cast coin, "+f);
        }
    }
}
class CastCoinFactory implements CastSomethingFactory{

    @Override
    public CastSomething castWhat() {
        return new CastCoin();
    }
}
class CastDice implements CastSomething{

    @Override
    public void cast() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int f = random.nextInt(6);
            System.out.println("Cast Dice "+f);
        }
    }
}
class CastDiceFactory implements CastSomethingFactory{

    @Override
    public CastSomething castWhat() {
        return new CastDice();
    }
}