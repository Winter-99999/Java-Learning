package practice.practice5;

import java.util.ArrayList;
import java.util.Collections;

public class Thread5 extends Thread {
    static int[] arr = {10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700};
    static int sum = 0;
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
    }

    @Override
    public void run() {
        while (true) {
            synchronized (Thread5.class) {
                if (sum == arr.length) break;
                Collections.shuffle(list);
                int prize = list.remove(0);
                System.out.println(getName() + "开到了" + prize + "元");
                sum++;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
