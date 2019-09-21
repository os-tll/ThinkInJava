package section12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

import static jdk.nashorn.internal.objects.NativeError.printStackTrace;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/21 16:37
 */
public class Ex6 {
    public static void main(String[] args) {
        try {

            throw new Ex3AidException1();
//            throw new Ex3AidException2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Ex3AidException1 extends Exception {
    Logger logger = Logger.getLogger("Ex3AidException1");

    Ex3AidException1() {
        StringWriter stringWriter = new StringWriter();
        printStackTrace(new PrintWriter(stringWriter));
        logger.severe(stringWriter.toString());
    }
}

class Ex3AidException2 extends Exception {
    Logger logger = Logger.getLogger("Ex3AidException2");

    Ex3AidException2() {
        StringWriter stringWriter = new StringWriter();
        printStackTrace(new PrintWriter(stringWriter));
        logger.severe(stringWriter.toString());
    }

}
