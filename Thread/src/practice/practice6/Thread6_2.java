package practice.practice6;

import java.util.ArrayList;
import java.util.Collections;

public class Thread6_2 extends Thread {
    static int[] arr = {10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700};
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        Collections.shuffle(list);
    }

    @Override
    public void run() {
        ArrayList<Integer> list1 = new ArrayList<>();
        while (true) {
            synchronized (Thread6_2.class) {
                if (list.size() == 0) {
                    System.out.println(getName() + " " + list1);
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
    }
}
