//! package section6;

import section6.Ex6;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/27 21:49
 */
public class Ex7 {
    public static void main(String[] args) {
        Ex7 ex7 = new Ex7();
        if(ex7.ex6 == null){

            ex7.ex6 = new section6.Ex6();
        }
    }
    Ex6 ex6;
}
