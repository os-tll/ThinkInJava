package section12;

/**
 * 异常链
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/22 14:51
 */
public class Ex10 {
    public static void main(String[] args) {
        try {
            new Ex10Aid().f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Ex10Aid{
    void f() throws Exception{
        try {
            g();
        } catch (Exception e) {
            /*1抛出非Exception,Error,RuntimeException类异常需要使initCause方法*/
//            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
//            arrayIndexOutOfBoundsException.initCause(e);
//            throw arrayIndexOutOfBoundsException;
            /*抛出Exception类的异常*/
            throw new Ex10AidException2(e);
        }
    }
    void g() throws Exception{
        throw new Ex10AidException1();
    }
}
class Ex10AidException1 extends Exception{}
class Ex10AidException2 extends Exception{
    Ex10AidException2(Exception e){
        super(e);
    }
}