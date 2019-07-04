package section9;

/**
 * 证明接口中域变量是static public final的
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/4 15:56
 */
public class Ex17 {
    public static void main(String[] args) {
        //证明了域变量自动是 static public final的
        //! Ex17Aid.NUM1 = 10;
    }
}
interface Ex17Aid{
    int NUM1 = 0, NUM2 = 2, NUM3 =3;
}

