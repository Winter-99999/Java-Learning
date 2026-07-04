package method;

public class method4 {
    public static void main(String[] args) throws InterruptedException {
        //插入线程
        MethodRunnable1 mr = new MethodRunnable1();
        Thread t1 = new Thread(mr, "t1");
        t1.start();
        t1.join();      //先执行t1线程
        System.out.println("t1线程结束");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "  " + i);
        }
    }
}
