package section9;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/2 11:04
 */
public class Ex7 {
    public static void main(String[] args) {
        Rodent2[] rodents = {new Mouse2(), new Gerbil2(), new Hamster2()};
        for(Rodent2 rodent : rodents){
            rodent.eat();
        }
    }
}
interface Rodent2{
    void eat();
}
class Mouse2 implements Rodent2 {
    @Override
    public void eat(){
        System.out.println("老鼠：吱吱");
    }
}
class Gerbil2 implements Rodent2 {
    @Override
    public void eat(){
        System.out.println("鼹鼠：吱吱");
    }
}
class Hamster2 implements Rodent2 {
    @Override
    public void eat(){
        System.out.println("大颊鼠：吱吱");
    }
}