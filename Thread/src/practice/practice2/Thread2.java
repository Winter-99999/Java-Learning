package practice.practice2;

public class Thread2 extends Thread{
    static int count = 100;
    static Object lock=new Object();
    @Override
    public void run(){
        while(true){
            synchronized (lock){
                if (count==10) {
                    break;
                }
                    System.out.println(Thread.currentThread().getName()+"正在送第"+count+"个礼物");
                    count--;
                    System.out.println("剩余礼物数量为："+count);
            }
        }

    }
}
