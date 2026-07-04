package practice.practice1;

public class Thread1 extends Thread{
    static int count = 1000;
    static Object lock=new Object();
    @Override
    public void run(){
        while(true){
            synchronized (lock) {
                if (count == 0) break;
                System.out.println(getName() + "正在卖第" + count + "张票");
                count--;
                System.out.println("剩余票数：" + count);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
