package practice.practice7;

import practice.practice6.Thread6_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class Callable7 implements Callable<Integer> {
    ArrayList<Integer> list = new ArrayList();

    public Callable7(ArrayList<Integer> list) {
        this.list = list;
        Collections.shuffle(list);
    }

    static int max = 0;
    static Thread t = new Thread();

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> list1 = new ArrayList<>();
        while (true) {
            synchronized (Thread6_2.class) {
                if (list.size() == 0) {
                    System.out.println(Thread.currentThread().getName() + " " + list1);
                    if (Collections.max(list1) > Callable7.max) {
                        t = Thread.currentThread();
                        Callable7.max = Collections.max(list1);
                    }
                    break;
                }
                int prize = list.remove(0);
                list1.add(prize);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (list1.size() == 0) {
            return null;
        } else {
            return Collections.max(list1);
        }
    }
}
