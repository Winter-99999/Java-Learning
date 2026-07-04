package method;

public class method6 {
    public static void main(String[] args) {
        Runnable r = new MethodRunnable2();
        Thread t1 = new Thread(r, "t1");
        Thread t2 = new Thread(r, "t2");
        t1.start();
        t2.start();
    }
}
