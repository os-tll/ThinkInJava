package section8;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/7/1 14:09
 */
public class Ex9 {
    public static void main(String[] args) {
        Rodent[] rodents = {new Mouse(), new Gerbil(), new Hamster()};
        for(Rodent rodent : rodents){
            rodent.eat();
        }
    }
}
class Rodent{
    protected void eat(){
        System.out.println("吱吱");
    }
}
class Mouse extends Rodent{
    @Override
    public void eat(){
        System.out.println("老鼠：吱吱");
    }
}
class Gerbil extends Rodent{
    @Override
    public void eat(){
        System.out.println("鼹鼠：吱吱");
    }
}
class Hamster extends Rodent{
    @Override
    public void eat(){
        System.out.println("大颊鼠：吱吱");
    }
}

