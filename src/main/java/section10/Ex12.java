package section10;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/5 15:29
 */
public class Ex12 {
    private int i;
    public int j;
    public int getI(){
        return i;
    }
    public int getJ(){
        return j;
    }
    public void sout(){
        Ex12Aid1 ex12Aid1 = new Ex12Aid1(){
            @Override
            public void setI(int i){
                Ex12.this.i = i;
            }
            @Override
            public void setJ(int i){
                Ex12.this.j = j;
            }
            @Override
            public int getI(){
                return Ex12.this.getI();
            }
            @Override
            public int getJ(){
                return Ex12.this.getJ();
            }
        };
        System.out.println(ex12Aid1.getI());
        System.out.println(ex12Aid1.getJ());
        ex12Aid1.setI(10);
        ex12Aid1.setJ(10);
        System.out.println(ex12Aid1.getI());
        System.out.println(ex12Aid1.getJ());
    }

    public static void main(String[] args) {
        new Ex7().sout();
    }
}
class Ex12Aid1{

    public void setI(int i){}
    public void setJ(int i){}
    public int getI(){return 0;}
    public int getJ(){return 0;}
}


