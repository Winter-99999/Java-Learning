package method;

public class method3 {
    public static void main(String[] args) {
        //守护线程
        //当其他非守护线程结束后，守护线程会陆续结束
        MethodRunnable1 mr = new MethodRunnable1();
        Thread t1 = new Thread(mr, "t1");
        MethodThread1 t2 = new MethodThread1("t2");
        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
