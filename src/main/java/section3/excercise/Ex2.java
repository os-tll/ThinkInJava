package section3.excercise;

/**
 * 赋值时的别名现象
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/19 19:59
 */
public class Ex2 {
    int i;
    Ex2(int i){
        this.i = i;
    }
    public static void main(String[] args) {
        Ex2 ex2_1 = new Ex2(1);
        Ex2 ex2_2 = new Ex2(2);
        //ex2_1的引用被指向ex2_2，原对象被回收
        ex2_1 = ex2_2;
        System.out.println("ex2_1: "+ex2_1.i+" ex2_2: "+ex2_2.i);
        //两个引用现在指向同一对象
        ex2_1.i = 3;
        System.out.println("ex2_1: "+ex2_1.i+" ex2_2: "+ex2_2.i);
    }
}
