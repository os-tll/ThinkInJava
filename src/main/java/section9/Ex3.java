package section9;

/**
 * 构造器中的多态，同P167。
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/2 10:18
 */
public class Ex3 {
    public static void main(String[] args) {
        new Ex3Aid2().print();
    }
}
abstract class Ex3Aid{
    Ex3Aid(){
        print();
    }
    protected abstract void print();
}
class Ex3Aid2 extends Ex3Aid{
    int i = 10;
    @Override
    public void print(){
        System.out.println(i);
    }
}