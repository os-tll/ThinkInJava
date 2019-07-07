package section10;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/7 11:57
 */
public class Ex22 {


    public static void main(String[] args) {
        //创建外部类Ex2
        Ex22 ex22 = new Ex22();
        //获取内部类对象Ex22Aid
        Ex22Aid ex22Aid1 = ex22.getEx22Aid("123");
        Ex22Aid ex22Aid2 = ex22.getEx22Aid("456");
        Ex22Aid ex22Aid3 = ex22.getEx22Aid("789");

        //创建对象Sequence,存入内部类对象Ex22Aid
        Sequence3 sequence3 = new Sequence3(3);
        sequence3.add(ex22Aid1);
        sequence3.add(ex22Aid2);
        sequence3.add(ex22Aid3);
        //使用内部类Selector进行迭代内部类对象Ex22Aid，打印
        Selector selector = sequence3.getSelector(0);
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
    public Ex22Aid getEx22Aid(String str){
        return new Ex22Aid(str);
    }
    class Ex22Aid{

        String str;
        Ex22Aid(String str){
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
interface Selector3{
    boolean end();
    Object current();
    void next();
}
/**
 * 用来存储对象使用
 * @author tanglonglong ＼(－－)／
 * @date 10:17 2019/7/5
 */
class Sequence3{
    Object[] objects;
    int i = 0;
    Sequence3(int size){
        objects = new Object[size];
    }
    public void add(Object o){
        objects[i++] = o;
    }
    public Selector getSelector(int i){
        if(i == 0){
            return new SelectorImpl();
        }else{
            return new RevertSelectorImpl();

        }
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
    private class RevertSelectorImpl implements Selector{
        //当前下标，初始化为0
        int currentIndex = objects.length-1;
        @Override
        public boolean end() {
            return currentIndex == -1;
        }

        @Override
        public Object current() {
            return objects[currentIndex];
        }

        @Override
        public void next() {
            currentIndex--;
        }
    }
}
