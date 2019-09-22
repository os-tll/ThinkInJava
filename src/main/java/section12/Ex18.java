package section12;

/**
 * 缺憾---异常丢失
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/22 16:58
 */
public class Ex18 {
    public static void main(String[] args) {
        try {
            Ex18 ex18 = new Ex18();
            try {

                try {
                    ex18.f();
                } finally {
                    ex18.dispose();
                }
            } finally {
                ex18.clean();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void f() throws Ex18AidImportException {
        throw new Ex18AidImportException();
    }

    private void dispose() throws Ex18AidTrivialException {
        throw new Ex18AidTrivialException();
    }

    private void clean() throws Ex18AidIgnoreException {
        throw new Ex18AidIgnoreException();
    }
}

class Ex18AidTrivialException extends Exception {
}

class Ex18AidImportException extends Exception {
}

class Ex18AidIgnoreException extends Exception {
}
