package exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.*;

/**
 * 线程池学习之ExecutorService
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/8/12 13:50
 */
public class ThreadPool2 {

    public static void main(String[] args) {
        ThreadCreated threadCreated = new ThreadCreated();
        try {
            threadCreated.call();
            threadCreated.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
        FutureTask futureTask1 = new FutureTask<Long>(threadCreated);
        FutureTask futureTask2 = new FutureTask<Long>(threadCreated);
        FutureTask futureTask3 = new FutureTask<Long>(threadCreated);
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(futureTask1);
        executorService.submit(futureTask2);
        executorService.submit(futureTask3);
        executorService.shutdown();
        try {
            System.out.println(futureTask1.get());
            System.out.println(futureTask2.get());
            System.out.println(futureTask3.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
    static class ThreadCreated implements Callable{
        public void get(){

            try(FileInputStream fileInputStream = new FileInputStream(new File("aaa"))){
                fileInputStream.available();
        } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        @Override
        public Long call() throws Exception {
            System.out.println("当前时间->"+System.currentTimeMillis()+Thread.currentThread());
            Thread.sleep(5000);
            return System.currentTimeMillis();
        }

    }
}
