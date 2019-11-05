package section13;

import java.util.Formatter;

/**
 * Formatter的使用
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/9/30 15:02
 */
public class Ex3 {
    Formatter f;
    String name;
    Ex3(String name, Formatter formatter){
        this.name = name;
        this.f = formatter;
    }

    public static void main(String[] args) {
        Ex3 ex3 = new Ex3("aaa", new Formatter(System.err));
        //formatter的format方法可接受格式化数据
        ex3.f.format("Name is\n %s, %-20f",ex3.name,333f);
    }
}
