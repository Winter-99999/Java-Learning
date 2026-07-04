package practice.practice2;

public class p2 {
    public static void main(String[] args) {
        Thread2 t1 = new Thread2();
        Thread2 t2 = new Thread2();
        t1.setName("商店1");
        t2.setName("商店2");
        t2.start();
        t1.start();
    }
}
