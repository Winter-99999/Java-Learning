package demo;

public class MyThread2 implements Runnable{
    public void run() {
        for (int i = 0; i < 50; i++) {
            //获取当前线程 Thread.currentThread()
            System.out.println(Thread.currentThread().getName()+"  2026.6.15  "+i);
        }
    }
}
