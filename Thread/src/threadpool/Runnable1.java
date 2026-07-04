package threadpool;

public class Runnable1 implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
