package section2.exercise;

/**
 * 验证成员变量为基本类型会被初始化
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/18 19:12
 */
public class Ex1 {
    byte aByte;
    short aShort;
    int anInt;
    long aLong;
    float aFloat;
    double aDouble;
    char aChar;
    boolean aBoolean;
    public static void main(String[] args){
        Ex1 ex1 = new Ex1();
        System.out.println(ex1.aByte);
        System.out.println(ex1.aShort);
        System.out.println(ex1.anInt);
        System.out.println(ex1.aLong);
        System.out.println(ex1.aFloat);
        System.out.println(ex1.aDouble);
        System.out.println(ex1.aChar);
        System.out.println(ex1.aBoolean);
    }
}
