package section12;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 多层异常捕获
 *
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/9/29 15:48
 */
public class Ex25 {
    public static void main(String[] args) {
        Ex25Aid3 ex25Aid3 = new Ex25Aid3();
        Ex25Aid2 ex25Aid2 = ex25Aid3;
        Ex25Aid ex25Aid = ex25Aid3;
        try {
            ex25Aid.fun();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch ( IOException e) {
            System.out.println(e);
            //需要捕获基类的异常声明，并且放在最后的catch
        }catch ( Exception e) {
            System.out.println(e);
        }
    }
}

class Ex25Aid {
    public void fun() throws Exception {
        throw new FileNotFoundException();
    }
}

class Ex25Aid2 extends Ex25Aid {
    @Override
    public void fun() throws IOException {
        throw new FileNotFoundException();
    }
}

class Ex25Aid3 extends Ex25Aid2 {
    @Override
    public void fun() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}