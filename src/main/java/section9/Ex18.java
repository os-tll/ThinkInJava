package section9;

/**
 * 工厂模式
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/4 16:37
 */
public class Ex18 {
    CycleImplFactory cycleImplFactory;
    public static void main(String[] args) {
        Ex18 ex18 = new Ex18();
        new UnicycleImplFactory().getCycleImpl().draw();
        new BicycleImplFactory().getCycleImpl().draw();
        new TricycleImplFactory().getCycleImpl().draw();
    }
}

interface Cycle{
    void draw();
}
interface CycleImplFactory{
    Cycle getCycleImpl();
}

class Unicycle implements Cycle{

    @Override
    public void draw() {
        System.out.println("I am Unicyle");
    }
}
class UnicycleImplFactory implements CycleImplFactory{

    @Override
    public Cycle getCycleImpl() {
        return new Unicycle();
    }
}
class Bicycle implements Cycle{

    @Override
    public void draw() {
        System.out.println("I am Bicyle");
    }
}
class BicycleImplFactory implements CycleImplFactory{

    @Override
    public Cycle getCycleImpl() {
        return new Bicycle();
    }
}
class Tricycle implements Cycle{

    @Override
    public void draw() {
        System.out.println("I am Tricycle");
    }
}
class TricycleImplFactory implements CycleImplFactory{

    @Override
    public Cycle getCycleImpl() {
        return new Tricycle();
    }
}
