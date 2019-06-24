package section4;

/**
 * switch练习
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/22 15:06
 */
public class Ex8 {
    public static void main(String[] args) {
        for (int i = 'a'; i <= 'e'; i++){
            switch (i){
                case 'a':
                    System.out.println("I AM A");
                 case 'b':
                    System.out.println("I AM B");
                     break;
                case 'c':
                    System.out.println("I AM C");
                    break;
                case 'd':
                    System.out.println("I AM D");
                    break;
                default:
                    System.out.println(i);
            }
        }
    }
}
