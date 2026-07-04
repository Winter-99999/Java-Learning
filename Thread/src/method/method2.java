package method;

public class method2 {
    public static void main(String[] args) {
        // void setPriority(int newPriority) 设置线程优先级 1-10 默认5
        // int getPriority()  获取线程优先级
        MethodRunnable1 mr = new MethodRunnable1();
        Thread t1 = new Thread(mr, "t1");
        Thread t2 = new Thread(mr, "t2");
        t1.setPriority(1);
        t2.setPriority(10);
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " " + t.getPriority());
        t1.start();
        t2.start();
    }
}
