package section8;

/**
 *
 * @author tanglonglong
 * @version 1.0
 * @date 2019/7/1 17:21
 */
public class Ex13 {
    public static void main(String[] args) {
        Ex13Aid ex13Aid = new Ex13Aid();
        Ex13Aid2[] ex13Aid2s = {
                new Ex13Aid2(ex13Aid),new Ex13Aid2(ex13Aid),new Ex13Aid2(ex13Aid),new Ex13Aid2(ex13Aid)
        };
        for(Ex13Aid2 ex13Aid2 : ex13Aid2s){
            ex13Aid2.dispose();
        }
        //TODO: finalize 检验不执行   -……-
        ex13Aid = null;
        ex13Aid2s = null;
        System.gc();
        System.runFinalization();
    }
}
class Ex13Aid{
    int[] ints = new int[Integer.MAX_VALUE/10];
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Ex13Aid(){
        System.out.println("Creating " + this);
    }
    public void addRef(){
        refcount++;
    }
    protected void dispose(){
        if(--refcount == 0){
            System.out.println("Disposing  " + this);
        }
    }
    @Override
    public String toString(){
        return "Ex13Aid " + id;
    }
    @Override
    public void finalize(){
        if(refcount == 0){
            System.out.println("out--0");
        }else {
            System.out.println("out---1");
        }
        try {
            super.finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
class Ex13Aid2 {
    private Ex13Aid ex13Aid;
    private static long counter = 0;
    private final long id = counter++;

    public Ex13Aid2(Ex13Aid ex13Aid) {
        System.out.println("Creating " + this);
        this.ex13Aid = ex13Aid;
        this.ex13Aid.addRef();
    }

    protected void dispose() {
        System.out.println("disposing " + this);
        ex13Aid.dispose();
    }

    @Override
    public String toString() {
        return "Ex13Aid2  " + id;
    }

    @Override
    public void finalize(){
        System.out.println("out--0");
        try {
            super.finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
