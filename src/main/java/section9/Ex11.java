package section9;

/**
 * 练习适配器模式
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/4 13:43
 */
public class Ex11 {
    Processor processor;
    public static void main(String[] args) {
        Ex11 ex11 = new Ex11();
        ex11.processor = new Upcase();
        new Apply().porcess(ex11.processor,"abcde");
        //使用适配器之后就可以调用新的方法了
        ex11.processor = new ProcessorAdapter();
        new Apply().porcess(ex11.processor,"abcde");


    }
}

class Ex11Aid{
    /**
     * 完成字符串中的头尾整个顺序置换
     * @param str 调换前的字符串
     * @return 调换后的字符串
     */
    public String exchangeStr(String str){
        char[] charArray = str.toCharArray();
        char[] replacedCharArray = new char[str.length()];
        for (int i = 0; i < charArray.length; i++) {
            replacedCharArray[i] = charArray[charArray.length - 1 - i];
        }
        return new String(replacedCharArray);
    }
}

//接口定义
interface Processor{
    String name();
    Object process(Object input);
}
//接口的一个实现
class Upcase implements Processor{

    @Override
    public String name() {
        return getClass().getSimpleName();
    }
    @Override
    public Object process(Object input) {
        return ((String)input).toUpperCase();
    }
}
//策略模式使用接口实现
class Apply{
    public void porcess(Processor p, Object s){
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
//适配器模式进行接口实现
class ProcessorAdapter implements Processor{
    @Override
    public String name() {
        return getClass().getSimpleName();
    }
    @Override
    public Object process(Object input) {
        return new Ex11Aid().exchangeStr((String)input);
    }
}

