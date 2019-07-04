package section9;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/2 11:00
 */
public class Ex6 implements Ex6Aid{
    public static void main(String args[]){
        new Ex6().fun1();
    }
    //Error:(13, 10) java: section9.Ex6中的fun1()无法实现section9.Ex6Aid中的fun1()
    //  正在尝试分配更低的访问权限; 以前为public
    @Override
    public void fun1(){
    //! void fun1(){
        System.out.println("fun1");
    }
}
interface Ex6Aid{
    void fun1();
}
