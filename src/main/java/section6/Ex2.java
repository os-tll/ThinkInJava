package section6;

//! import section3.excercise.Ex1;
/**
 * 验证同名类使用时不指定包会出现冲突
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/24 20:58
 */
public class Ex2 {
    public static void main(String[] args) {
        new Ex1();
        new section3.excercise.Ex1();
    }
}
