package practice.practice6;

import java.util.ArrayList;
import java.util.Collections;

public class Thread6 extends Thread {
    static int[] arr = {10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700};
    static int sum = 0;
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> list1 = new ArrayList<>();
    static ArrayList<Integer> list2 = new ArrayList<>();
    static boolean isprinted = false;

    static {
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        Collections.shuffle(list);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (Thread6.class) {
                if (sum == arr.length) {
                    int sum1 = 0;
                    int max1 = 0;
                    for (int i = 0; i < list1.size(); i++) {
                        if (list1.get(i) > max1) max1 = list1.get(i);
                        sum1 += list1.get(i);
                    }
                    int sum2 = 0;
                    int max2 = 0;
                    for (int i = 0; i < list2.size(); i++) {
                        if (list2.get(i) > max2) max2 = list2.get(i);
                        sum2 += list2.get(i);
                    }
                    if (!isprinted) {
                        System.out.println("抽奖箱1开到了" + list1.size() + "个红包" + "总计" + sum1 + "最大值" + max1);
                        System.out.println(list1);
                        System.out.println("抽奖箱2开到了" + list2.size() + "个红包" + "总计" + sum2 + "最大值" + max2);
                        System.out.println(list2);
                        isprinted = true;
                    }
                    break;
                }
                int prize = list.remove(0);
                if (getName().equals("抽奖箱1")) list1.add(prize);
                if (getName().equals("抽奖箱2")) list2.add(prize);
//                System.out.println(getName()+"开到了"+prize+"元");
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
