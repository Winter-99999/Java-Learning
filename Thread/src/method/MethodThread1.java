package method;

public class MethodThread1 extends Thread {
    public MethodThread1() {
    }

    public MethodThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "  2026.6.15  " + i);
        }
        try {
            sleep(3000);  //休眠3秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + "  2026.6.15  " + "线程结束");
    }
}
