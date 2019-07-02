package section8;

/**
 * 多态验证
 * @author tanglonglong
 * @version 1.0
 * @date 2019/7/1 13:49
 */
public class Ex6 {
    public static void main(String[] args) {
        Instrument[] instruments = {new Wind(),new Percussion(),new Stringed(),new Brass()};
        for(Instrument instrument : instruments){
            instrument.play();
            System.out.println(instrument);
        }
    }
}
class Instrument{
    void play(){
        System.out.println("Instrument play");
    }
    String what(){
        return "Instrument";
    }
    void adjust(){
        System.out.println("Adjusting Instrument");
    }

    @Override
    public String toString() {
        return what();
    }
}
class Wind extends Instrument{
    @Override
    void play(){
        System.out.println("Wind play");
    }
    @Override
    String what(){
        return "Wind";
    }
    @Override
    void adjust(){
        System.out.println("Adjusting Wind");
    }
}
class Percussion extends Instrument{
    @Override
    void play(){
        System.out.println("Percussion play");
    }
    @Override
    String what(){
        return "Percussion";
    }
    @Override
    void adjust(){
        System.out.println("Adjusting Percussion");
    }
}
class Stringed extends Instrument{
    @Override
    void play(){
        System.out.println("Stringed play");
    }
    @Override
    String what(){
        return "Stringed";
    }
    @Override
    void adjust(){
        System.out.println("Adjusting Stringed");
    }
}
class Brass extends Wind{
    @Override
    void play(){
        System.out.println("Brass play");
    }
    @Override
    void adjust(){
        System.out.println("Adjusting Brass");
    }
}
