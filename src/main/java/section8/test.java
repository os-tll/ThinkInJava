package section8;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/9/5 11:05
 */
public class test {
    public static void main(String[] args) {
        TestAid testAid = new TestAid(555);
    }
}
    class TestAid{
        int i = 100 ;
        {
            System.out.println(i);
        };
        TestAid(int i ){
            System.out.println(i);
            this.i = i;
        }
    }
