package section10;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/7 11:44
 */
public class Ex00 {
    public static void main(String[] args) {
        Ex00Aid ex00Aid = new Ex00Aid();
        ex00Aid.new Ex00Aid1();
    }
}
class Ex00Aid{
    public static Ex00Aid1 getEx00Aid1(){
        Ex00Aid ex00Aid = new Ex00Aid();
        return ex00Aid.new Ex00Aid1();
    }
    class Ex00Aid1{

    }
}
