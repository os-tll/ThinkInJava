package section12;

/**
 * 重新抛出异常
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/22 13:07
 */
public class Ex9 {
    public static void main(String[] args) {
        Ex9 ex9 = new Ex9();

        try {
            ex9.occurException();
        } catch (Ex9Aid1 e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement element : stackTrace) {
                System.err.println(element);
            }
        } catch (Exception e) {
            System.out.println("456");
            e.printStackTrace();
            e.getStackTrace();
        }
    }

    private void occurException() throws Ex9Aid1, Ex9Aid2, Ex9Aid3 {
        throw new Ex9Aid3();
//        throw new NullPointerException();
    }
}

class Ex9Aid1 extends Exception {

}

class Ex9Aid2 extends Ex9Aid1 {

}

class Ex9Aid3 extends Ex9Aid1 {

}
