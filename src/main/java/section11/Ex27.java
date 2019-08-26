package section11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Queue之LinkedList
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/19 20:12
 */
public class Ex27 {

    public static void main(String[] args) {
        //生成Queue
        Random random = new Random(47);
        Queue<Ex27Aid> ex27Aids = new LinkedList<>();
        for (int i = 1; i < 20; i++) {
            ex27Aids.add(new Ex27Aid(i+"->"+ random.nextInt(i)+""));
        }
        System.out.println("ex27Aids.size -》  "+ex27Aids.size());
        //消费Queue
        Ex27Aid2 ex27Aid2 = new Ex27Aid2();
        ex27Aid2.useQueue(ex27Aids);
    }
    static class Ex27Aid{
        Ex27Aid(String str){
            this.str = str;
        }
        String str;
        public String getStr(){
            return str;
        }
    }
    static class Ex27Aid2{
        public void useQueue(Queue<Ex27Aid> queue){
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Ex27Aid poll = queue.poll();
                if( poll != null ){
                    System.out.println(poll.getStr());
                }
            }
        }
    }
}
