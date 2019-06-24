package section5;

/**
 * this用法
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/23 16:04
 */
public class Ex8 {
    Ex8(){}
    Ex8(String s){
    //! System.out.println();
        this(); //置于调用的最开始处，只可调用一次。
    }

    public void fun1(){
        fun2();
        this.fun2();
    }
    public void fun2(){
        System.out.println(this+"fun2");
    }

    public static void main(String[] args) {
        new Ex8().fun1();
        //! Ex8("ass");   除构造器之外，禁止在其他方法中调用构造器
    }
}
