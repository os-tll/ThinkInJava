package section5;

/**
 * 编写finalize()
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/23 16:52
 */
public class Ex10 {

    public static void main(String[] args) {
        int loop = 10;
        while(loop-- > 0){
        new TestFinalize();
        //调用gc的目的是提醒，具体会不会回收还取决于JVM
        System.gc();
        }
    }
}
class TestFinalize{
    @Override
    protected void finalize(){
        System.out.println("Ex10 deleted");
    }
}

