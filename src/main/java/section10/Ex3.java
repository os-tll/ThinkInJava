package section10;

/**
 * 内部类具有外部类的所有访问权限
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/5 10:37
 */
public class Ex3 {
    private String outStr = "!QAZxsw2";
    public static void main(String[] args) {
        //创建外部类Ex3
        Ex3 Ex3 = new Ex3();
        //获取内部类对象Ex3Aid
        Ex3Aid Ex3Aid1 = Ex3.getEx3Aid();

        //创建对象Sequence,存入内部类对象Ex3Aid
        Sequence sequence = new Sequence(1);
        sequence.add(Ex3Aid1);
        //使用内部类Selector进行迭代内部类对象Ex3Aid，打印
        Selector selector = sequence.getSelector();
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
    public Ex3Aid getEx3Aid(){
        return new Ex3Aid();
    }
    class Ex3Aid{
        @Override
        public String toString(){
            return outStr;
        }
    }
}