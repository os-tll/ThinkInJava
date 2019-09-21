package section12;

/**
 * 调用异常处理
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/21 14:45
 */
public class Ex1 {
    public static void main(String[] args) {
        try{
            throw new Exception("这里出错了!!!");
        }catch (Exception e){
            e.printStackTrace(System.out);
        }finally {
            System.out.println("finally done");
        }
    }
}
