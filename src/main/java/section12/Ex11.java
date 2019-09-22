package section12;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/22 15:11
 */
public class Ex11 {
    public static void main(String[] args) {
        Ex11Aid ex11Aid = new Ex11Aid();
        ex11Aid.f();
    }
}
class Ex11Aid{
    void f() {
        try {
            g();
        } catch (Exception e) {
            /*注:抛出非Exception,Error,RuntimeException类异常需要使initCause方法*/
            throw new RuntimeException(e);
        }
    }
    void g() throws Exception{
        throw new Ex10AidException1();
    }
}