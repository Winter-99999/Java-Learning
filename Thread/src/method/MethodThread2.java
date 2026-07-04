package method;

public class MethodThread2 extends Thread {
    static int ticket = 0;
    static Object obj = new Object();

    @Override
    public void run() {
        while (ticket < 50) {
            synchronized (obj) {  //同步代码块
                ticket++;
                System.out.println(getName() + " 正在卖第" + ticket + "张票");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
