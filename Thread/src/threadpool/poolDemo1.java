package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class poolDemo1 {
    public static void main(String[] args) throws InterruptedException {
        //获取线程池对象
//        ExecutorService pool = Executors.newCachedThreadPool(); //创建一个无数量限制的线程池
        ExecutorService pool = Executors.newFixedThreadPool(3); //创建一个确定最大线程数量的线程池
        //提交任务
        pool.submit(new Runnable1());
        Thread.sleep(1000);
        pool.submit(new Runnable1());
        Thread.sleep(1000);
        //结束任务 销毁线程池
        pool.shutdown();

    }
}
