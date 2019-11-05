package section12;

/**
 *  异常捕获
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/9/29 14:26
 */
public class Ex23_24 {
    public static void main(String[] args) {
        try {
            Ex23Aid ex23Aid = new Ex23Aid();
            try {
                ex23Aid.ex23Aid2a.doSomething();
                ex23Aid.ex23Aid2b.doSomething();
            } finally {
                ex23Aid.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Ex23Aid {
    public Ex23Aid2 ex23Aid2a;
    public Ex23Aid2 ex23Aid2b;

    Ex23Aid() throws Exception {
        ex23Aid2a = new Ex23Aid2();
        try {
            throw new Exception("构造崩了");
        } catch (Exception e) {
            ex23Aid2a.dispose();
            throw new Exception("构造崩了");
        }
//        ex23Aid2b = new Ex23Aid2();
    }

    public void doSomething() throws Exception {
        throw new Exception("doSomething崩了");
    }

    public void dispose() {
        System.out.println("销毁。。。");
    }
}

class Ex23Aid2 {
    public void dispose() {
        System.out.println("销毁。。。");
    }

    public void doSomething() throws Exception {
        throw new Exception("doSomething崩了");
    }
}
