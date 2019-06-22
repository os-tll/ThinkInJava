package section2.exercise;

/**
 * 调用storage
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/18 19:59
 */
public class Ex6 {
    public static void main(String[] args) {
        int storage = new Ex6().storage("12345我");
        System.out.println(storage);
    }
    int storage(String s){
        return s.length() * 2;
    }
}
