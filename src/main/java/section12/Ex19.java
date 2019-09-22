package section12;

/**
 * 通过finally加try-catch避免原异常被忽略
 *
 * @author tanglonglong
 * @version 1.0
 * @date 2019/9/22 17:18
 */
public class Ex19 {

    public static void main(String[] args) {
        try {
            Ex19 ex19 = new Ex19();
            try {

                try {
                    ex19.f();
                } finally {
                    try {
                        ex19.dispose();
                    } catch (Exception e) {
                        //do something..
                    }
                }
            } finally {
                try {

                    ex19.clean();
                } catch (Exception e) {
                    //do something..
                }
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
