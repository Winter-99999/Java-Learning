package method.method9;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{
    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run(){
        while(true){
            if(Desk.count == 0) break;
            try {
                String food = queue.take();
                System.out.println("大胃王正在吃"+food);
                Desk.count--;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
