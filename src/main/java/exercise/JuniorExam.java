package exercise;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/29 15:23
 *   ┏┓　　　┏┓
 * ┏┛┻━━━┛┻┓
 * ┃　　　　　　　┃ 　
 * ┃　　　━　　　┃
 * ┃　┳┛　┗┳　┃
 * ┃　　　　　　　┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　　┃
 * ┗━┓　　　┏━┛
 * 　　┃　　　┃神兽保佑
 * 　　┃　　　┃代码无BUG！
 * 　　┃　　　┗━━━┓
 * 　　┃　　　　　　　┣┓
 * 　┃　　　　　　　┏┛
 * 　┗┓┓┏━┳┓┏┛
 * 　　　┃┫┫　┃┫┫
 * 　　　┗┻┛　┗┻┛
 */
public class JuniorExam {
    public static void main(String[] args) {
//        new JuniorExam().question1();
//        new JuniorExam().question2();
//        new JuniorExam().question3();
//        new JuniorExam().question4();
//        new JuniorExam().question5();
//        new JuniorExam().question6();
//        new JuniorExam().question9();
//        new JuniorExam().question10();
//        new JuniorExam().question11();
//        new JuniorExam().question12();
        new JuniorExam().question13();
    }
    private void question1(){

        int i = 1;
        int j = i++;
        if(i == (++j) && (i++) == j){
            i += j;
        }
        System.out.println(i);
    }//sout: 5

    private void question2(){
        //! long x = 1.0;
        System.out.println(Float.MAX_VALUE > Double.MAX_VALUE);
        //! byte x = 200;
    }//sout: false

    private void question3(){
        int x = 10;
        double y = 20.2;
        long z = 10L;
        String str = "" + x + y * z;
        System.out.println(str);
    }//sout: 10202.0

    private void question4(){
        int sum = 0;
        for (int x = 0; x < 10; x++){
            sum += x;
            if( x % 3 == 0){
                break;
            }
        }
        System.out.println(sum);
    } //sout: 0

    private void question5(){
        System.out.println(question5Aid(10) + question5Aid(8) + question5Aid(-10));
    } //out: 35
    private int question5Aid(int temp){
        if(temp > 0){
            return temp * 2;
        }
        return -1;
    }

    private void question6(){
        int num = 2147483647;
        num += 2;
        System.out.println(num);
    } //sout:-2147483647

    private void question7(){
        long num = 100;
        //! int x = num + 2;
    } //类型转换

    private void question8(){
       //! byte a = 257;
        short b = 1;
        int c = 1;
        char d = ' ';
        float e = 1222222222.3f;
        double f = 222222222222.2;
        long g = 13333333333L;
        boolean h = false;
    }

    private void question9(){
        boolean flag = 10 % 2 == 1 && 10 / 3 == 0 && 1 / 0 == 0;
        System.out.println(false ? "mldn" : "yootk");
    }//sout: yootk;

    private void question10(){
        String str = "";
        for (int x = 0; x < 5; x++){
            str += x;
        }
        System.out.println(str);
    }//sout: 01234

    /**
     * mmp: 认真看准了
     */
    private void question11(){
        int num = 2147483647;
        long temp = num + 2L;
        System.out.println(num);
    } //sout:2147483647

    private void question12(){
        int sum = 0;
        int x = 10;
        while (x > 0){
            sum += x;
            System.out.println(x);
        }
        System.out.println(sum);
    }
    private void question13(){
        char c = 'A';
        int num = 10;
        switch (c){
            case 'B':
                num++;
            case 'A':
                num++;
            case 'Y':
                num++;
                break;
            default:
                num--;
        }
        System.out.println(num);
    }
}

