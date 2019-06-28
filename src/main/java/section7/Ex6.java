package section7;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/28 13:56
 */
public class Ex6 extends Ex6Aid {
    Ex6(){
    //若未基类提供默认的构造器需要在子类构造中显示调用下
        super(1);
    }
    public static void main(String[] args) {

    }
}
class Ex6Aid{
    Ex6Aid(int i){
        System.out.println(i);
    }
}
