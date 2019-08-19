package section11;

import java.util.ArrayList;
import java.util.List;

/**
 * 内部类的调用
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/5 10:11
 */
public class Ex3 {

    public static void main(String[] args) {
        //创建外部类Ex2
        Ex3 ex3 = new Ex3();
        //获取内部类对象Ex2Aid
        Ex3Aid ex3Aid = ex3.getEx2Aid("aaa");
        Ex3Aid ex2Aid2 = ex3.getEx2Aid("bbb");
        Ex3Aid ex2Aid3 = ex3.getEx2Aid("ccc");
        Ex3Aid ex2Aid4 = ex3.getEx2Aid("ddd");

        //创建对象Sequence,存入内部类对象Ex2Aid
        Sequence sequence = new Sequence();
        sequence.add(ex3Aid);
        sequence.add(ex2Aid2);
        sequence.add(ex2Aid3);
        sequence.add(ex2Aid4);
        //使用内部类Selector进行迭代内部类对象Ex2Aid，打印
        Selector selector = sequence.getSelector();
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
    public Ex3Aid getEx2Aid(String str){
        return new Ex3Aid(str);
    }
    class Ex3Aid {

        String str;
        Ex3Aid(String str){
            this.str = str;
        }
        @Override
        public String toString(){
            return str;
        }
    }
}
/**
 * 选择器
 * @author tanglonglong ＼(－－)／
 * @date 10:17 2019/7/5
 */
interface Selector{
    boolean end();
    Object current();
    void next();
}
/**
 * 用来存储对象使用
 * @author tanglonglong ＼(－－)／
 * @date 10:17 2019/7/5
 */
class Sequence{
    private List<Object> objects = new ArrayList<>();
    int i = 0;
    public void add(Object o){
        objects.add(o);
    }
    Selector getSelector(){
        return new SelectorImpl();
    }
    private class SelectorImpl implements Selector {
        //当前下标，初始化为0
        int currentIndex = 0;
        @Override
        public boolean end() {
            return currentIndex == objects.size();
        }

        @Override
        public Object current() {
            return objects.get(currentIndex);
        }

        @Override
        public void next() {
            currentIndex++;
        }
    }
}
