package exercise;

import java.util.concurrent.*;

/**
 * CountDownLatch用法，等待其他线程执行完毕后再执行
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/19 9:48
 */
public class ThreadCountDownLatch {
    static int i = 0;
    public static void main(String[] args) {
        //创建线程池
        ThreadFactory threadFactory = (runnable)->{
            Thread thread = new Thread(runnable,"thread"+i++);
            System.out.println("thread"+i);
            return thread;
        };
        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(1);

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3,  60,TimeUnit.SECONDS,queue,threadFactory);
        //创建CountDownLatch
        CountDownLatch countDownLatch = new CountDownLatch(3);
        //创建多个Task
        Callable<String> callable1 = ()->{
            Thread.sleep(3000);
            countDownLatch.countDown();
            System.out.println("线程1");
            return "线程1睡了3S，醒了";
        };
        FutureTask<String> task1 = new FutureTask<>(callable1);
        Callable<String> callable2 = ()->{
            Thread.sleep(4000);
            countDownLatch.countDown();
            System.out.println("线程2");
            return "线程2睡了4S，醒了";
        };
        FutureTask<String> task2 = new FutureTask<>(callable2);
        Callable<String> callable3 = ()->{
            Thread.sleep(2000);
            countDownLatch.countDown();
            System.out.println("线程3");
            return "线程3睡了2S，醒了";
        };
        FutureTask<String> task3 = new FutureTask<>(callable3);
        //开始运行
        threadPoolExecutor.submit(task1);
        threadPoolExecutor.submit(task2);
        threadPoolExecutor.submit(task3);
        threadPoolExecutor.shutdown();
        try {
            countDownLatch.await();
            System.out.println("主线程await完成，可以运行！");
            System.out.println("结果"+task1.get());
            System.out.println("结果"+task2.get());
            System.out.println("结果"+task3.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

            System.out.println("All Done");
    }
}
