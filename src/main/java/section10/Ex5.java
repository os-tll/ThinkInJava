package section10;

/**
 * 创建内部类的对象
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/5 11:09
 */
public class Ex5 {
    public static void main(String[] args) {

        Ex5Aid ex5Aid = new Ex5Aid();
        Ex5Aid.Ex5Aid2 ex5Aid2 = ex5Aid.new Ex5Aid2();
    }
    /**
     * 没有了外部类this作为绑定对象，这种创建方式也不可以了
     */
    //! public void callEx5Aid2(){
    //! new Ex5Aid.Ex5Aid2();
    //! }
}
class Ex5Aid{
    class Ex5Aid2{

    }
}
