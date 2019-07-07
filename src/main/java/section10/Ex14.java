package section10;


/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/5 15:43
 */
public class Ex14 {

    public Ex14Aid ex9AidImpl(){
        Ex14Aid ex14Aid = () -> System.out.println("fun");
        return ex14Aid;
    }
}
interface Ex14Aid{
    void fun();
}
