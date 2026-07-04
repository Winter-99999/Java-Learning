package practice.practice6;

import practice.practice5.Thread5;

public class p6 {
    public static void main(String[] args) {
        Thread6 t1 = new Thread6();
        Thread6 t2 = new Thread6();
        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");
        t2.start();
        t1.start();
    }
}
