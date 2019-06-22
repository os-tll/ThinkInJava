package section2.exercise;

/**
 * 证明某个特定的static域只有一个实例
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/18 20:16
 */
public class Ex8 {
    static int i = 11;
    int j = 22;
    public static void main(String[] args) {
        Ex8 ex8i1 = new Ex8();
        Ex8 ex8i2 = new Ex8();
        Ex8 ex8j1 = new Ex8();
        Ex8 ex8j2 = new Ex8();
        int i1 = ex8i1.i++;
        int i2 = ex8i2.i;

        int j1 = ex8j1.j++;
        int j2 = ex8j2.j;
        System.out.println(i1+",\n"+i2+",\n"+j1+",\n"+j2);
    }
}
