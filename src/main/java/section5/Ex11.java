package section5;

/**
 * 保证finalize()被调用
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/23 16:52
 */
public class Ex11 {

    public static void main(String[] args) {
        int loop = 10;
        while(loop-- > 0){
            new TestFinalize2();
            System.out.println("-->"+loop);
            System.gc();
        }
    }
}
/**
 * 保证调用原理: 只要程序没有濒临存储空间用完的那一刻，对象占用的空间就总也得不到释放
 * 故在类型放一个大数组，这样就finalize就总会被调
 * @author tanglonglong
 * @date 17:09 2019/6/23
 */

class TestFinalize2{
    @Override
    protected void finalize(){
        System.out.println("Ex10 deleted");
    }
    int[] x = new int[Integer.MAX_VALUE/10];
}
