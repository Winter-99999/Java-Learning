package method.method9;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends  Thread{
    ArrayBlockingQueue <String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true) {
            if (Desk.count == 0) break;
            try {
                queue.put("food");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("厨师正在准备食物");
        }
    }
}
