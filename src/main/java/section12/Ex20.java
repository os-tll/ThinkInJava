package section12;

/**
 * 异常继承
 *
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/9/29 9:29
 */
public class Ex20 extends Inning implements Storm {
    public Ex20() throws BaseballExcepition {

    }

    @Override
    public void atBat() throws Foul, Strike, UmpireArgument {

    }

    @Override
    public void rainHard() throws RainedOut {

    }

    @Override
    public void event() {

    }

    @Override
    public void dicition() throws UmpireArgument {

    }
}

class BaseballExcepition extends Exception {
}

class Foul extends BaseballExcepition {
}

class Strike extends BaseballExcepition {
}

class UmpireArgument extends BaseballExcepition {
}

abstract class Inning {
    public Inning() throws BaseballExcepition {
    }

    public void event() throws BaseballExcepition {
    }

    public abstract void atBat() throws Strike, Foul, UmpireArgument;

    public abstract void dicition() throws UmpireArgument;

    public void walk() {
    }
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
    void event() throws RainedOut;

    void rainHard() throws RainedOut;
}
