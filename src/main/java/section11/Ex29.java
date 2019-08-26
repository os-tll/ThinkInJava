package section11;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * PriorityQueue 具有优先级的队列所存储的元素，必须实现
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/19 21:13
 */
public class Ex29 {
    public static void main(String[] args) {
        new Ex29().setPriorityQueue();
    }
    public void setPriorityQueue(){
        PriorityQueue<Ex29Aid> ex29Aids = new PriorityQueue<>();
        ex29Aids.add(new Ex29Aid());
        ex29Aids.add(new Ex29Aid());
        ex29Aids.add(new Ex29Aid());
    }
    class Ex29Aid extends Object{}
}//out:
/*
Exception in thread "main" java.lang.ClassCastException: section11.Ex29$Ex29Aid cannot be cast to java.lang.Comparable
	at java.util.PriorityQueue.siftUpComparable(PriorityQueue.java:653)
	at java.util.PriorityQueue.siftUp(PriorityQueue.java:648)
	at java.util.PriorityQueue.offer(PriorityQueue.java:345)
	at java.util.PriorityQueue.add(PriorityQueue.java:322)
	at section11.Ex29.setPriorityQueue(Ex29.java:18)
	at section11.Ex29.main(Ex29.java:13)

Process finished with exit code 1
 */
