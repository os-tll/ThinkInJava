package exercise;

import java.util.concurrent.*;

/**
 * 让两个线程通过wait和notify交叉运行
 *
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/15 21:40
 */
public class ThreadWaitNotify {
    public static void main(String[] args) {
        Object o = new Object();
        ThreadFactory threadFactory = Thread::new;
        ArrayBlockingQueue<Runnable> runnables = new ArrayBlockingQueue<>(10);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 30, TimeUnit.SECONDS, runnables,threadFactory);

        Callable<Long>  callable1 =()->{
            synchronized(o){
                System.out.println("1开始");
                System.out.println(System.currentTimeMillis());
                o.wait();
                System.out.println("1又开始");
                System.out.println(System.currentTimeMillis());
                o.notify();
                Thread.sleep(3000);
                System.out.println("1又又开始");
            }
            return System.currentTimeMillis();
        };
        Callable<Long>  callable2 =()->{
            synchronized (o){
                System.out.println("2开始");
                System.out.println(System.currentTimeMillis());
                o.notify();
                o.wait();
                System.out.println("2又开始");
                System.out.println(System.currentTimeMillis());
            }
            return System.currentTimeMillis();
        };
        FutureTask<Long> callableFutureTask1 = new FutureTask<>(callable1);
        FutureTask<Long> callableFutureTask2 = new FutureTask<>(callable2);
        executor.submit(callableFutureTask1);
        executor.submit(callableFutureTask2);
        executor.shutdown();
        try {
            System.out.println(callableFutureTask1.get());
            System.out.println(callableFutureTask2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
