package section8;

import java.util.Random;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/7/1 13:08
 */
public class Ex2 {
    public static void main(String[] args) {
        Random random = new Random(47);
        Ex2Aid ex2Aid = null;
        for (int i = 0; i < 10; i++) {
            int r = random.nextInt(3);
            switch (r){
                case 0: ex2Aid = new Ex2Aid2();
                break;
                case 1: ex2Aid = new Ex2Aid3();
                break;
                case 2: ex2Aid = new Ex2Aid4();
                break;
                default:
            }
            ex2Aid.draw();
            ex2Aid.erase();
        }
    }
}
class Ex2Aid{
    public void draw(){
        System.out.println("Ex2Aid.draw");
    }

    public void erase(){
        System.out.println("Ex2Aid.erase");
    }
}
class Ex2Aid2 extends Ex2Aid {
    @Override
    public void draw() {
        System.out.println("Ex2Aid2.draw");
    }

    @Override
    public void erase() {
        System.out.println("Ex2Aid2.erase");
    }
}
class Ex2Aid3 extends Ex2Aid {
    @Override
    public void draw() {
        System.out.println("Ex2Aid3.draw");
    }

    @Override
    public void erase() {
        System.out.println("Ex2Aid3.erase");
    }
}
class Ex2Aid4 extends Ex2Aid{
    @Override
    public void draw(){
        System.out.println("Ex2Aid4.draw");
    }

    @Override
    public void erase(){
        System.out.println("Ex2Aid4.erase");
    }
}