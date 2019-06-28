package section7;

/**
 * 学习下继承和覆盖，使用了下builder
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/28 10:59
 */
public class Ex2 extends Ex2Aid{
    private StringBuffer ff = new StringBuffer();
    public static void main(String[] args) {
        String ex2Aid = new Ex2Aid().fun1().fun2().fun3().build();
        String ex2 = ((Ex2) new Ex2().fun1().fun2()).fun3().fun4().build();
        System.out.println(ex2Aid);
        System.out.println(ex2);
    }
    @Override
    public Ex2 fun3(){
        ff.append(" Ex2 fun3 ");
        return this;
    }
    public Ex2 fun4(){
        ff.append(" Ex2 fun4 ");
        return this;
    }
    @Override
    public String build(){
        String build = super.build();
        String s = build + new String(ff);
        return s;
    }

}
class Ex2Aid{
    private StringBuffer f = new StringBuffer();
    protected Ex2Aid fun1(){
        f.append(" Ex2Aid fun1 ");
        System.out.println(this.getClass());
        return this;
    }
    protected Ex2Aid fun2(){
        f.append("Ex2Aid fun2 ");
        return this;
    }
    protected Ex2Aid fun3(){
        f.append(" Ex2Aid fun3 ");
        return this;
    }
    public String build(){
        return new String(f);
    }
}
