package section10;


/**
 * 工厂模式改进版 之 匿名内部类
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/5 16:27
 */
public class Ex16 {

    CycleImplFactory cycleImplFactory;
    public static void main(String[] args) {
        Ex16 ex16 = new Ex16();
        new Factories(Unicycle.factory).callDraw();
        new Factories(Bicycle.factory).callDraw();
        new Factories(Tricycle.factory).callDraw();
    }
}

interface Cycle{
    void draw();
}
interface CycleImplFactory{
    Cycle getCycleImpl();
}

class Unicycle implements Cycle {
    private Unicycle(){};
    @Override
    public void draw() {
        System.out.println("I am Unicyle");
    }
    public static CycleImplFactory factory = new CycleImplFactory(){

        @Override
        public Cycle getCycleImpl() {
            return new Unicycle();
        }
    };
}
class Bicycle implements Cycle {

    @Override
    public void draw() {
        System.out.println("I am Bicyle");
    }
    public static CycleImplFactory factory = new CycleImplFactory(){

        @Override
        public Cycle getCycleImpl() {
            return new Bicycle();
        }
    };
}
class Tricycle implements Cycle {

    @Override
    public void draw() {
        System.out.println("I am Tricycle");
    }
    public static CycleImplFactory factory = new CycleImplFactory(){

        @Override
        public Cycle getCycleImpl() {
            return new Tricycle();
        }
    };
}

class Factories{
    CycleImplFactory factory;
    Factories(CycleImplFactory factory){
        this.factory = factory;
    }
    public void callDraw(){
        factory.getCycleImpl().draw();
    }
}