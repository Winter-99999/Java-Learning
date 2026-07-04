package method.method9;

import java.util.concurrent.ArrayBlockingQueue;

public class method9 {
    public static void main(String[] args) {
        ArrayBlockingQueue queue=new ArrayBlockingQueue<>(2);
        Foodie f =new Foodie(queue);
        Cook c =new Cook(queue);
        f.start();
        c.start();
    }
}
