package section3.excercise;

/**
 * 方法调用时的别名现象
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/19 20:09
 */
public class Ex3 {
    float i;
    void setI(Ex3 ex3){
        ex3.i = 10f;
    }

    public static void main(String[] args) {
        Ex3 ex3_1 = new Ex3();
        //新建Ex3_2,i的值为0
        Ex3 ex3_2 = new Ex3();
        //传入对象的引用ex3_2，修改i的值
        ex3_1.setI(ex3_2);
        //对象的值已被修改
        System.out.println(ex3_2.i);
    }
}
