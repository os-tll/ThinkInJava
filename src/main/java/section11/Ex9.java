package section11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * iterator的自定义实现^v^
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/8 15:34
 */
public class Ex9 {

    public static void main(String[] args) {
        //创建外部类Ex2
        Ex9 ex9 = new Ex9();
        //获取内部类对象Ex2Aid
        Ex9Aid ex9Aid = ex9.getEx2Aid("aaa");
        Ex9Aid ex2Aid2 = ex9.getEx2Aid("bbb");
        Ex9Aid ex2Aid3 = ex9.getEx2Aid("ccc");
        Ex9Aid ex2Aid4 = ex9.getEx2Aid("ddd");

        //创建对象Sequence,存入内部类对象Ex2Aid
        Sequence2 sequence = new Sequence2();
        sequence.add(ex9Aid);
        sequence.add(ex2Aid2);
        sequence.add(ex2Aid3);
        sequence.add(ex2Aid4);
        //使用内部类Selector进行迭代内部类对象Ex2Aid，打印
        Iterator iterator = sequence.getSelector();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
    public Ex9Aid getEx2Aid(String str){
        return new Ex9Aid(str);
    }
    class Ex9Aid {

        String str;
        Ex9Aid(String str){
            this.str = str;
        }
        @Override
        public String toString(){
            return str;
        }
    }
}
/**
 * 用来存储对象使用
 * @author tanglonglong ＼(－－)／
 * @date 10:17 2019/7/5
 */
class Sequence2{
    private List<Object> objects = new ArrayList<>();
    int i = 0;
    public void add(Object o){
        objects.add(o);
    }
    Iterator getSelector(){
        return new SelectorImpl();
    }
    /**
     * 使用内部类实现Sequence2专属的迭代
     */
    private class SelectorImpl implements Iterator {
        //当前下标，初始化为0
        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex <= objects.size() - 1;
        }

        @Override
        public Object next() {
            return objects.get(currentIndex++);
        }
    }
}
