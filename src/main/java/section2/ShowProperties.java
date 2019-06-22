package section2;
/**
 * 啊啊啊啊
 * <ol>
 * <li>aaa
 * <a>aaaaaa</a>
 * </ol>
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/17 13:43
 *
 */
public class ShowProperties{
    /**
     *  主方法
     * @param args 命令行参数
     * @throws RuntimeException 运行时异常
     */
    public static void main(String[] args) throws RuntimeException{
        //获取系统所有属性。list()将结果发给参数即System.out
        System.getProperties().list(System.out);
        //获取系统中一个属性
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
