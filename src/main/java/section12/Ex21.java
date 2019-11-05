package section12;

/**
 * 派生类构造无法捕获基类构造的异常
 *  也就是说： 无法对父类构造器进行异常的捕获
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/9/29 14:00
 */
public class Ex21  extends Ex21Aid{
    public Ex21() throws Exception{
        try{
//!            super();
        }catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        try{
            new Ex21();
            try {
                //do something...
            }catch (Exception e){

            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class Ex21Aid{
    public Ex21Aid() throws Exception{
        throw new NullPointerException();
    }
}
