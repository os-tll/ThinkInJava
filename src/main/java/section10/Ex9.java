package section10;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/5 13:35
 */
public class Ex9 {
    public Ex9Aid ex9AidImpl(){
        class Ex9Aid2 implements Ex9Aid{
            @Override
            public void fun() {
                System.out.println("fun");
            }
        }
        return new Ex9Aid2();
    }
}
interface Ex9Aid{
    void fun();
}
