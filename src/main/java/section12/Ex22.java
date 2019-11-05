package section12;

/**
 * 调用构造器可能会失败的类，验证代码健壮性
 *
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/9/29 14:13
 */
public class Ex22 {
    public static void main(String[] args) {
        try {
            Ex22Aid ex22Aid = new Ex22Aid();
            try {
                ex22Aid.doSomething();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                ex22Aid.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Ex22Aid {
    Ex22Aid() throws Exception {
        //情况1 注释掉
        // throw new Exception("构造崩了");
        //情况2 放开注释
        throw new Exception("构造崩了");
    }

    public void doSomething() throws Exception {
        throw new Exception("doSomething崩了");
    }

    public void dispose() {
        System.out.println("销毁。。。");
    }
}
