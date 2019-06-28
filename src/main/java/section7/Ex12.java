package section7;

/**
 * 保证正常清理内存以外的东西（模拟析构）
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/28 15:13
 */
public class Ex12 {
    public static void main(String[] args) {
        Ex12Aid4 ex12Aid4 = null;
        try{

            ex12Aid4 = new Ex12Aid4();
        }catch (Exception e){

        }finally {
            ex12Aid4.dispose();
        }
    }
}
class Ex12Aid{
    Ex12Aid(){
        System.out.println("Ex12Aid");
    }
    public void dispose(){
        System.out.println("Ex12Aid is dying...");
    }
}
class Ex12Aid2{
    Ex12Aid2(){
        System.out.println("Ex12Aid2");
    }
    public void dispose(){
        System.out.println("Ex12Aid2 is dying...");
    }
}

class Ex12Aid3{
    Ex12Aid3(){
        System.out.println("Ex12Aid3");
    }
    Ex12Aid ex12Aid = new Ex12Aid();
    Ex12Aid2 ex12Aid2 = new Ex12Aid2();
    public void dispose(){
        ex12Aid.dispose();
        ex12Aid2.dispose();
        System.out.println("Ex12Aid3 is dying...");
    }
}
class Ex12Aid4 extends Ex12Aid3{
    Ex12Aid4(){
        System.out.println("Ex12Aid4");
    }
    @Override
    public void dispose(){
        super.dispose();
        System.out.println("Ex12Aid3 is dying...");
    }
}
