package section8;

import java.util.Random;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/7/1 13:08
 */
public class Ex3 {
    public static void main(String[] args) {
        Random random = new Random(47);
        Ex3Aid ex3Aid = null;
        for (int i = 0; i < 10; i++) {
            int r = random.nextInt(3);
            switch (r){
                case 0: ex3Aid = new Ex3Aid2();
                    break;
                case 1: ex3Aid = new Ex3Aid3();
                    break;
                case 2: ex3Aid = new Ex3Aid4();
                    break;
                default:
            }
            ex3Aid.draw();
            ex3Aid.erase();
            ex3Aid.out();
        }
    }
}
class Ex3Aid{
    public void draw(){
        System.out.println("Ex3Aid.draw");
    }

    public void erase(){
        System.out.println("Ex3Aid.erase");
    }

    public void out(){
        System.out.println("out");
    }
}
class Ex3Aid2 extends Ex3Aid {
    @Override
    public void draw() {
        System.out.println("Ex3Aid2.draw");
    }

    @Override
    public void erase() {
        System.out.println("Ex3Aid2.erase");
    }

    @Override
    public void out(){
        System.out.println("Ex3Aid2.out");
    }
}
class Ex3Aid3 extends Ex3Aid {
    @Override
    public void draw() {
        System.out.println("Ex3Aid3.draw");
    }

    @Override
    public void erase() {
        System.out.println("Ex3Aid3.erase");
    }

    @Override
    public void out(){
        System.out.println("Ex3Aid3.out");
    }
}
class Ex3Aid4 extends Ex3Aid{
    @Override
    public void draw(){
        System.out.println("Ex3Aid4.draw");
    }

    @Override
    public void erase(){
        System.out.println("Ex3Aid4.erase");
    }

    @Override
    public void out(){
        System.out.println("Ex3Aid4.out");
    }
}