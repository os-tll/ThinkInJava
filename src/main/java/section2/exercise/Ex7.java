package section2.exercise;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/18 20:11
 */
public class Ex7 {
    static int i ;
    public static void main(String[] args) {
        System.out.println(Incrementable.increment());
        System.out.println(Incrementable.increment());
        System.out.println(Incrementable.increment());
        System.out.println(Incrementable.increment());

    }

}
 class Incrementable{
    static int increment(){
        return ++Ex7.i;
    }
}

