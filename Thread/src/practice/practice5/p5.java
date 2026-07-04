package practice.practice5;

public class p5 {
    public static void main(String[] args) {
        Thread5 t1 = new Thread5();
        Thread5 t2 = new Thread5();
        t2.start();
        t1.start();
    }
}
