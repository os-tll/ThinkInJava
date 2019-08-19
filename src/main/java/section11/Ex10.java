package section11;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/8 16:00
 */
public class Ex10 {
    public static void main(String[] args) {
        Rodent[] rodents = {new Mouse(), new Gerbils(), new Hamster()};
        List<Rodent> rodentList = Arrays.asList(rodents);
        Iterator<Rodent> iterator = rodentList.iterator();
        while (iterator.hasNext()){
            Rodent rodent = iterator.next();
            rodent.eat();
        }
    }
}
class Rodent{
    protected void eat(){
        System.out.println("吱吱");
    }
}
class Mouse extends Rodent {
    @Override
    public void eat(){
        System.out.println("老鼠：吱吱");
    }
}
class Gerbils extends Rodent {
    @Override
    public void eat(){
        System.out.println("鼹鼠：吱吱");
    }
}
class Hamster extends Rodent {
    @Override
    public void eat(){
        System.out.println("大颊鼠：吱吱");
    }
}
