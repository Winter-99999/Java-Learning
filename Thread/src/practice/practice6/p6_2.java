package practice.practice6;

public class p6_2 {
    public static void main(String[] args) {
        Thread6_2 t1 = new Thread6_2();
        Thread6_2 t2 = new Thread6_2();
        Thread6_2 t3 = new Thread6_2();
        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");
        t3.setName("抽奖箱3");
        t1.start();
        t2.start();
        t3.start();
    }
}
