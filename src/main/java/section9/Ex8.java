package section9;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/2 11:11
 */
public class Ex8 extends Lunch implements FastFood {
    @Override
    public void eatFastFood(){
        System.out.println("delicious");
    }
    public static void main(String[] args){
        Ex8 ex8 = new Ex8();
        ex8.eatFastFood();
    }
}
interface FastFood{
    void eatFastFood();
}
class Mail{
    Mail(){
        System.out.println("mail");
    }
}
class Lunch extends Mail{
    Lunch(){
        System.out.println("Lunch");
    }
}