package section9;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/2 10:14
 */
public class Ex1 {
    public static void main(String[] args) {
        section9.Rodent[] rodents = {new section9.Mouse(), new section9.Gerbil(), new section9.Hamster()};
        for(section9.Rodent rodent : rodents){
            rodent.eat();
        }
    }
}
abstract class Rodent{
    protected abstract void eat();
}
class Mouse extends section9.Rodent {
    @Override
    public void eat(){
        System.out.println("老鼠：吱吱");
    }
}
class Gerbil extends section9.Rodent {
    @Override
    public void eat(){
        System.out.println("鼹鼠：吱吱");
    }
}
class Hamster extends section9.Rodent {
    @Override
    public void eat(){
        System.out.println("大颊鼠：吱吱");
    }
}


