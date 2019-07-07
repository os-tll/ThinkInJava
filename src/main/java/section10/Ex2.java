package section10;

import sun.nio.ch.SelectorImpl;

/**
 * 内部类的调用
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/5 10:11
 */
public class Ex2 {

    public static void main(String[] args) {
        //创建外部类Ex2
        Ex2 ex2 = new Ex2();
        //获取内部类对象Ex2Aid
        Ex2Aid ex2Aid1 = ex2.getEx2Aid("aaa");
        Ex2Aid ex2Aid2 = ex2.getEx2Aid("bbb");
        Ex2Aid ex2Aid3 = ex2.getEx2Aid("ccc");

        //创建对象Sequence,存入内部类对象Ex2Aid
        Sequence sequence = new Sequence(3);
        sequence.add(ex2Aid1);
        sequence.add(ex2Aid2);
        sequence.add(ex2Aid3);
        //使用内部类Selector进行迭代内部类对象Ex2Aid，打印
        Selector selector = sequence.getSelector();
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
    public Ex2Aid getEx2Aid(String str){
        return new Ex2Aid(str);
    }
    class Ex2Aid{

        String str;
        Ex2Aid(String str){
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
    Object[] objects;
    int i = 0;
    Sequence(int size){
        objects = new Object[size];
    }
    public void add(Object o){
        objects[i++] = o;
    }
    public Selector getSelector(){
        return new SelectorImpl();
    }
    private class SelectorImpl implements Selector{
        //当前下标，初始化为0
        int currentIndex = 0;
        @Override
        public boolean end() {
            return currentIndex == objects.length;
        }

        @Override
        public Object current() {
            return objects[currentIndex];
        }

        @Override
        public void next() {
            currentIndex++;
        }
    }
}
