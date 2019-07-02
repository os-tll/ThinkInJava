package section8;

/**
 * 新技能，状态模式
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/2 9:15
 * @au
 */
public class Ex16 {
    public static void main(String[] args) {
        Ex16Aid4 ex16Aid4 = new Ex16Aid4(new Ex16Aid2());
        ex16Aid4.callShow();
        ex16Aid4.change(Ex16Aid3.class);
        ex16Aid4.callShow();
    }
}
class Ex16Aid{
    protected void show(){
        System.out.println("Ex16Aid");
    }
}
class Ex16Aid2 extends Ex16Aid{
    @Override
    protected void show(){
        System.out.println("Ex16Aid2");
    }
}
class Ex16Aid3 extends Ex16Aid{
    @Override
    protected void show(){
        System.out.println("Ex16Aid3");
    }
}

/**
 * 关键的设计在change
 */
class Ex16Aid4 {
    Ex16Aid ex16Aid;
    public void callShow(){
        ex16Aid.show();
    }
    Ex16Aid4(Ex16Aid ex16Aid){
        this.ex16Aid = ex16Aid;
    }
    public void change(Class<?> ex16AidClass){
        try {
            ex16Aid = (Ex16Aid)ex16AidClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}