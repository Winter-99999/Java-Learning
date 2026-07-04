package demo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class demo3 {
    public static void main(String[] args) {
        //多线程的第三种实现方式
        //1. 创建一个类实现Callable接口
        //2. 在该类实现call方法
        //3. 创建一个该类的对象  表示多线程执行的任务
        //4. 创建一个FutureTask对象  管理线程执行结果
        //5. 创建一个Thread对象
        MyCollable myCollable = new MyCollable();
        FutureTask<Integer> ft = new FutureTask<>(myCollable);
        Thread t = new Thread(ft);
        t.start();
        try {
            System.out.println(ft.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
