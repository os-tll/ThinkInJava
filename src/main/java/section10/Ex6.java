package section10;

import section8.Section10Ex6Aid1;
import section9.Section10Ex6Aid2;

/**
 * 创建内部类的对象，向上转型为对应的接口
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/7/5 11:29
 */
public class Ex6 extends Section10Ex6Aid2 {
    /**
     * 创建内部类对象
     */
    public Section10Ex6Aid1 getInnerClass(){
        Section10Ex6Aid2 section10Ex6Aid2 = new Section10Ex6Aid2();
        return section10Ex6Aid2.new Section10Ex6Aid1Impl();
    }
}
