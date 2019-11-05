package section12;

/**
 * 运行时异常属于非检查类型异常
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/9/29 17:18
 */
public class Ex28 {
    public static void main(String[] args) {
        throw new Ex28AidException("aaa");
    }
}

class Ex28AidException extends RuntimeException {
    private String msg;

    Ex28AidException(String str) {
        this.msg = str;
    }

    void printMsg() {
        System.out.println("msg is " + msg);
    }
}
