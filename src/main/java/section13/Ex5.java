package section13;

import java.math.BigInteger;
import java.util.Formatter;
import java.util.Locale;

/**
 * 各种格式符混合输出
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/9/30 15:57
 */
public class Ex5 {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out, Locale.US);
//        Formatter f = new Formatter();

        char u = 'a';
        System.out.println("--------->char\nu = 'a'");
        //f.format("%d",u);
        f.format("%c"+"\n",u);//out: a
        f.format("%b"+"\n",u);//out: true
        f.format("%%%s"+"\n",u);//out: %a
        // f.format("%f");
        //f.format("%e");
        //f.format("%x");
        f.format("%h"+"\n",u);

        int v = 1000;
        System.out.println("--------->int\nv = 1000");
        f.format("%-10d"+"\n",v);
        f.format("%c"+"\n",v);//out: Ϩ
        f.format("%b"+"\n",v);//out: true
        f.format("%%%s"+"\n",v);//out: %1000
        //f.format("%f");
        //f.format("%e\n",v);
        f.format("%x\n",v);//out: 3e8
        f.format("%h\n",v);//out: 3e8

        BigInteger w = new BigInteger("50000000000000");
        System.out.println("--------->BigInteger \nw = 50000000000000");
        f.format("%-10d"+"\n",w);
//        f.format("%c"+"\n",w);//out: a
        f.format("%b"+"\n",w);//out: true
        f.format("%%%s"+"\n",w);//out: %a
//        f.format("%f",w);
//        f.format("%e\n",w);
        f.format("%x\n",w);
        f.format("%h\n",w);

        double x = 179.543;
        System.out.println("--------->double \nx = 179.543");
        //f.format("%-10d\n",x);
        //f.format("%c\n",x);//out: a
        f.format("%b\n",x);//out: true
        f.format("%%%s\n",x);//out: %a
        f.format("%f\n",x);
        f.format("%e\n",x);
        //f.format("%x\n",x);
        f.format("%h\n",x);

        Object y = new Object();
        System.out.println("--------->Object \ny = new Object()");
        //f.format("%-10d\n",y);
        //f.format("%c\n",y);//out: a
        f.format("%b\n",y);//out: true
        f.format("%%%s\n",y);//out: %a
        //f.format("%f\n",y);
        //f.format("%e\n",y);
        //f.format("%x\n",y);
        f.format("%h\n",y);

        boolean z = false;
        System.out.println("--------->boolean \nz = false");
//        f.format("%-10d\n",z);
//        f.format("%c\n",z);//out: a
        f.format("%b\n",z);//out: true
        f.format("%%%s\n",z);//out: %a
//        f.format("%f\n",z);
//        f.format("%e\n",z);
//        f.format("%x\n",z);
        f.format("%h\n",z);

        f.format("%%");

    }
}
