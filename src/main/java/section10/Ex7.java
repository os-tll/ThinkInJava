package section10;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/5 13:09
 */
public class Ex7 {
    private int i;
    public int j;
    public int getI(){
        return i;
    }
    public int getJ(){
        return j;
    }
    public void sout(){
        Ex7Aid1 ex7Aid1 = new Ex7Aid1();
        System.out.println(ex7Aid1.getI());
        System.out.println(ex7Aid1.getJ());
        ex7Aid1.setI(10);
        ex7Aid1.setJ(10);
        System.out.println(ex7Aid1.getI());
        System.out.println(ex7Aid1.getJ());
    }

    public static void main(String[] args) {
        new Ex7().sout();
    }
    class Ex7Aid1{
        public void setI(int i){
            Ex7.this.i = i;
        }
        public void setJ(int j){
            Ex7.this.j = j;
        }
        public int getI(){
            return Ex7.this.getI();
        }
        public int getJ(){
            return Ex7.this.getJ();
        }
    }
}

