package section8;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/7/1 14:00
 */
public class Ex7 {
    public static void main(String[] args) {
        Instrument[] instruments = {new Wind(),new Percussion(),new Stringed(),new Brass(),new Woodwind()};
        for(Instrument instrument : instruments){
            instrument.play();
            System.out.println(instrument);
        }
    }
}
class Woodwind extends Wind {
    @Override
    void play() {
        System.out.println("Woodwind play");
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Woodwind");
    }
}