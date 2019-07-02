package section8;

/**
 * 验证构造器内部的多态
 * @author tanglonglong
 * @version 1.0
 * @date 2019/7/1 21:30
 */
public class Ex15 {
    public static void main(String[] args) {

        Ex15Aid2 ex15Aid2 = new Ex15Aid2();
        ex15Aid2.show();
        ex15Aid2.callShow();


    }
}
class Ex15Aid{

    Ex15Aid(){
        //验证点1：此处show会调用子类的实现，而子类还未初始化
        show();
    }
    public final void callShow(){
        //验证点2：子类有实现，调用子类的
        show();
    }

    protected void show(){
        System.out.println("father show");
    }

}
class Ex15Aid2 extends Ex15Aid{
    int i = 10;
    @Override
    public void show(){
        System.out.println("son show" + i);
    }

}