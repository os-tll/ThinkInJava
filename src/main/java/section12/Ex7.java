package section12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * 接住异常,记录日志
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/21 17:36
 */
public class Ex7 {
    public static void main(String[] args) {
        try{
            throw new NullPointerException();
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            Logger.getLogger("aaa").severe(stringWriter.toString());
        }
    }
}
