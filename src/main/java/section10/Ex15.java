package section10;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/5 15:56
 */
public class Ex15 {
    public Ex15Aid fun(){
         return new Ex15Aid(10){
             @Override
             public void sout(){
                 System.out.println("I->"+i);
             }
         };
    }

    public static void main(String[] args) {
        new Ex15().fun().sout();
    }
}
class Ex15Aid{
    int i;
    Ex15Aid(int i){
        this.i = i;
        System.out.println(i);
    }
    public void sout(){
        System.out.println("I->"+i);
    }
}