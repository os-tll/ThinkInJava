package section10;

/**
 * 内部类使用外部类引用
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/5 11:04
 */
public class Ex4 {
}
class Sequence2{
    Object[] objects;
    int i = 0;
    Sequence2(int size){
        objects = new Object[size];
    }
    public void add(Object o){
        objects[i++] = o;
    }
    public Selector getSelector(){
        return new SelectorImpl();
    }
    private class SelectorImpl implements Selector{
        public Sequence2 getSequence2(){
            return Sequence2.this;
        }
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
