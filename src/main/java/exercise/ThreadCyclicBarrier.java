package exercise;

import javafx.scene.input.DataFormat;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.*;

/**
 * ThreadCyclicBarrier实现线程同时执行
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/19 17:02
 */
public class ThreadCyclicBarrier {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
        Callable callable = ()->{
            Object o = new Object();
            System.out.println(o+"线程开始执行");
            Thread.sleep(2000);
            cyclicBarrier.await();
            System.out.println(o+"已激活"+System.currentTimeMillis());
            return o+"线程执行结果";
        };
        ThreadFactory threadFactory = (runnable)->{
            return new Thread(runnable,"线程");
        };
        //使用无限线程的Executor
        ExecutorService service = Executors.newCachedThreadPool();
        Future futureTask1 = service.submit(callable);
        Future futureTask2 = service.submit(callable);
        Future futureTask3 = service.submit(callable);

        System.out.println(futureTask1.get());
        System.out.println(futureTask2.get());
        System.out.println(futureTask3.get());
        System.out.println("ALL DONE");
        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss").format(LocalDateTime.now()));
    }
}
