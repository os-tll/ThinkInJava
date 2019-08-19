package section11;

import java.util.ArrayList;

/**
 * 熟悉list
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/7 16:55
 */
public class Ex1 {
    ArrayList<Gerbil> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        ex1.arrayList.add(new Gerbil(1));
        ex1.arrayList.add(new Gerbil(2));
        ex1.arrayList.add(new Gerbil(3));
        for(Gerbil gerbile : ex1.arrayList){
            gerbile.hop();
        }
    }
}
class Gerbil{
    int gerbilNumber;
    Gerbil(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }
    public void hop(){
        System.out.println("gerbilNumber: "+gerbilNumber);
    }
}
