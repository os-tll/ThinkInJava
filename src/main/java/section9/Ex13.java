package section9;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/4 14:46
 */
public interface Ex13 {
    void fun();
}
interface Ex13Aid1 extends Ex13{

}
interface Ex13Aid2 extends Ex13{

}
interface Ex13Aid3 extends Ex13Aid1,Ex13Aid2{

}
class tesst implements Ex13Aid3{

    @Override
    public void fun() {

    }
}