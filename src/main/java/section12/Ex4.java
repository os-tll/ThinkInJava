package section12;


/**
 * 自定义异常并打印消息
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/21 15:06
 */
public class Ex4 {
    public static void main(String[] args) {
        try {
            throw new Ex4AidException("aaa");
        }catch (Ex4AidException e){
           e.printMsg();
        }
    }
}
class Ex4AidException extends Exception{
    private String msg;
    Ex4AidException(String str){
        this.msg = str;
    }
    void printMsg(){
        System.out.println("msg is " + msg);
    }
}
