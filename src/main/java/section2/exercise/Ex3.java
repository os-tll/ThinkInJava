package section2.exercise;

import lombok.Data;

/**
 * 进行类调用
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/18 19:35
 */
public class Ex3 {
    public static void main(String[] args) {
        String param = new ATypeName().getParam();
        System.out.println(param);
    }
}
@Data
class ATypeName{
    private String param;
}
