package section9;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/2 13:57
 */
public class Ex10 {

    public static void main(String[] args) {
        Ex10Aid[] ex10Aids = {new Ex10Aid2(), new Ex10Aid3()};
        for (Ex10Aid ex10Aid : ex10Aids){
            System.out.println(ex10Aid);
            ex10Aid.play();
            ex10Aid.adjust();
        }
    }
}
interface Playable{
    void play();
}
abstract class Ex10Aid  implements Playable{
    abstract public void adjust();
    int VALUE = 5;
}

class Ex10Aid2 extends Ex10Aid{

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
        return "Ex10Aid2";
    }
}
class Ex10Aid3 extends Ex10Aid2{

    @Override
    public String toString(){
        return "Ex10Aid3";
    }
}
