package section2.exercise;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/18 21:24
 */
public class Ex11 {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue){
        this.anIntegerRepresentingColors = newHue;
    }

    public static void main(String[] args) {
        Ex11 ex11 = new Ex11();
        ex11.changeTheHueOfTheColor(1);
    }
}
