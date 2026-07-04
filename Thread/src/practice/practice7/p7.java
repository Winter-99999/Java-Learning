package practice.practice7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.FutureTask;

public class p7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700));
        Callable7 callable = new Callable7(list);
        FutureTask<Integer> ft1 = new FutureTask<>(callable);
        FutureTask<Integer> ft2 = new FutureTask<>(callable);
        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);
        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");
        t1.start();
        t2.start();
        try {
            System.out.println("抽奖箱1最大奖金  " + ft1.get());
            System.out.println("抽奖箱2最大奖金  " + ft2.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Callable7.t.getName() + "开出了最大奖金" + Callable7.max);
    }
}
