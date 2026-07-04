package demo;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(getName()+"  2026.6.15  "+i);
        }
    }
}
