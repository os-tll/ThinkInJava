package section10;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/5 13:24
 */
public class Ex8 {
    public void callFun(){
        this.new Ex8Aid().fun();
    }
    class Ex8Aid{
        private void fun(){};
    }
}
