package threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class poolDemo2 {
    public static void main(String[] args) {
        //自定义线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,  //核心线程数量 大于等于0
                6,  //最大线程数量 大于等于0 大于等于核心线程数量
                60,  //最大线程空闲时间
                TimeUnit.SECONDS,  //最大线程空闲时间单位
                new ArrayBlockingQueue<>(3),  //任务队列 不能为null
                Executors.defaultThreadFactory(),   //线程工厂  不能为null
                new ThreadPoolExecutor.AbortPolicy()  //任务队列满时的拒绝策略  不能为null
        );
    }
}
