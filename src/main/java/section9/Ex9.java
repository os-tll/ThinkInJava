package section9;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/2 11:08
 */
public class Ex9 {
    public static void main(String[] args) {
        Ex9Aid[] ex9Aids = {new Ex9Aid2(), new Ex9Aid3()};
        for (Ex9Aid ex9Aid : ex9Aids){
            System.out.println(ex9Aid);
            ex9Aid.play();
            ex9Aid.adjust();
        }
    }
}
abstract class Ex9Aid{
    abstract public void play();
    abstract public void adjust();
    int VALUE = 5;
}
class Ex9Aid2 extends Ex9Aid{

    @Override
    public void play() {
        System.out.println(this + "play()");
    }

    @Override
    public void adjust() {
        System.out.println(this + "adjust()");
    }

    @Override
    public String toString(){
        return "Ex9Aid2";
    }
}
class Ex9Aid3 extends Ex9Aid2{

    @Override
    public String toString(){
        return "Ex9Aid3";
    }
}
