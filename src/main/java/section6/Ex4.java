package section6;

import section2.exercise.Ex8;

/**
 * 验证protected的权限
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/26 21:57
 */
public class Ex4 {
    public static void main(String[] args) {
        Ex8 ex8 = new Ex8();
        //! ex8.x;
        int y = ex8.y;
    }
}
