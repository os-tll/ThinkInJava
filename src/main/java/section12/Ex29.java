package section12;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/9/29 17:23
 */

/**
 * 异常继承
 *
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/9/29 9:29
 */
public class Ex29 extends Inning2 implements Storm2 {
    public Ex29() {

    }

    @Override
    public void atBat() {

    }

    @Override
    public void rainHard(){

    }

    @Override
    public void event() {

    }

    @Override
    public void dicition(){

    }
}

class BaseballExcepition2 extends RuntimeException {
}

class Foul2 extends BaseballExcepition2 {
}

class Strike2 extends BaseballExcepition2 {
}

class UmpireArgument2 extends BaseballExcepition2 {
}

abstract class Inning2 {
    public Inning2() throws BaseballExcepition2 {
    }

    public void event() throws BaseballExcepition2 {
    }

    public abstract void atBat() throws Strike2, Foul2, UmpireArgument2;

    public abstract void dicition() throws UmpireArgument2;

    public void walk() {
    }
}

class Storm2Exception2 extends RuntimeException {
}

class RainedOut2 extends Storm2Exception2 {
}

class PopFoul2 extends Foul2 {
}

interface Storm2 {
    void event() throws RainedOut2;

    void rainHard() throws RainedOut2;
}