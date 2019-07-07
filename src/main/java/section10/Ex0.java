package section10;

/**
 * 匿名内部类摸索之   匿名内部类竟然也可以继承自实体类
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/5 14:06
 */
public class Ex0 {
    public void fun(){
        Ex1 ex1 = new Ex1();
        Ex0Aid ex0Aid = new Ex0Aid(111) {
            public void fun(){
                //ex 不被定义为final也可以被调用，这个新版JDK的语法糖。编译的时候还是给加上了 MMP
                Ex1 ex1_1  = ex1;
            }
            //验证调用的是复写的方法
            @Override
            public void setH(int h) {
                System.out.println(h);
                //验证构造器被调用，值传递进来了
                System.out.println(i);
            }
        };
        //只是用的话不报错，当试图改这个值就会报错了
        //! ex1 = null;
        ex0Aid.setH(22222222);
    }

    public static void main(String[] args) {
        new Ex0().fun();
    }
}
class Ex0Aid{
    int i;
    Ex0Aid(int i){
        this.i = i;
    }
    int h;

    public void setH(int h) {
        this.h = h;
    }
}
interface Ex0Aid1{
    void setH(int h);
    void setEx1(Ex1 str);
}