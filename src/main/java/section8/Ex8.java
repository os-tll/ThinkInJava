package section8;

import java.util.Random;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/7/1 14:04
 */
public class Ex8 {
    public static void main(String[] args) {
        Instrument[] instruments = {new Wind(),new Percussion(),new Stringed(),new Brass(),new Woodwind()};
        Instrument instrument  = null;
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            int nextInt = random.nextInt(5);
            switch(nextInt){
                case 0:
                    instrument = new Wind();
                    break;
                case 1:
                    instrument = new Percussion();
                    break;
                case 2:
                    instrument = new Stringed();
                    break;
                case 3:
                    instrument = new Brass();
                    break;
                case 4:
                    instrument = new Woodwind();
                    break;
                default:
            }
            instrument.play();
            System.out.println(instrument);

        }
    }
}
