package exercise;

import java.sql.SQLOutput;
import java.sql.Time;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池学习之ThreadPoolExecutor
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/12 9:19
 */
public class ThreadPool1 {
    public static void main(String[] args) {
        //超出后处理模式，直接丢弃
        ThreadPoolExecutor.DiscardOldestPolicy discardOldestPolicy = new ThreadPoolExecutor.DiscardOldestPolicy();
        //创建队列
        LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(5);
        //创建线程池
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(3, 5, 3, TimeUnit.SECONDS, queue,discardOldestPolicy);
        //循环执行20次
        for (int i = 0; i < 20; i++) {
            poolExecutor.execute(new ThreadCreated());
            System.out.print("active"+poolExecutor.getActiveCount());
            System.out.println("->queue "+queue.size());
        }
        System.out.println("done");
        poolExecutor.shutdown();
    }
    static class ThreadCreated implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("异常发生"+e.getStackTrace());
            }
        }
    }
}
