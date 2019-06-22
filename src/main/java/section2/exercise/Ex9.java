package section2.exercise;

/**
 * 拆装包
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/18 20:51
 */
public class Ex9 {
    Byte aByte;
    short aShort;
    int anInt;
    long aLong;
    float aFloat;
    double aDouble;
    char aChar;
    boolean aBoolean;
    public static void main(String[] args) {
        Ex9 ex9 = new Ex9();
        //自动装包没有问题，自动拆包可能会存在问题
        byte aaByte = ex9.aByte;
        Short aaShort = ex9.aShort;
        Integer aaInteger = ex9.anInt;
        Long aaLong = ex9.aLong;
        Float aaFloat = ex9.aFloat;
        Double aaDouble = ex9.aDouble;
        Character aacharacter = ex9.aChar;
        Boolean aaBoolean = ex9.aBoolean;
        return;
    }
}
