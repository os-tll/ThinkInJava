package section6;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/27 9:34
 */
public class Ex5 {

    protected int h;
    public static void main(String[] args) {
        TestEx5 ex5 = new TestEx5();
        int i = ex5.i;
        int j = ex5.j;
        int m = ex5.m;
        //! ex5.n;
    }
}
class TestEx5{
    public int i ;
    protected int j;
    int m ;
    private int n;
}
