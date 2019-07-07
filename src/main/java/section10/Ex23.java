package section10;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/7 13:05
 */
public class Ex23 {
    public static void main(String[] args) {
        B b = new B(3);
        //取得U
        U u1 = new A().fun1();
        U u2 = new A().fun1();
        U u3 = new A().fun1();
        //放入到B
        b.addArrayU(u1);
        b.addArrayU(u2);
        b.addArrayU(u3);
        //迭代B
        b.iteratorArrayU();
        //B设置为Null
        b.setArrayUNull();
        //迭代B
        b.iteratorArrayU();
    }
}
interface U{
    void fun1();
    void fun2();
    void fun3();
}
/**
 * 内部类创建U
 */
class A{
    U fun1(){
       U u =  new U(){
           @Override
           public void fun1() {
               System.out.println("fun1");
           }

           @Override
           public void fun2() {
               System.out.println("fun2");
           }

           @Override
           public void fun3() {
               System.out.println("fun3");
           }
       };
       return u;
    }
}
class B{
    int i = 0;
    U[] a;
    B(int size){
        a = new U[size];
    }
    public void addArrayU(U u){
        a[i++] = u;
    }
    public void setArrayUNull(){
        a = null;
    }
    public void iteratorArrayU(){
        if(a == null){
            System.out.println("null");
            return;
        }
        for(U u : a){
            u.fun1();
            u.fun2();
            u.fun3();
        }
    }
}
