package practice.practice3;

public class p3 {
    public static void main(String[] args) {
        Thread3 t1 = new Thread3();
        Thread3 t2 = new Thread3();
        t1.start();
        t2.start();
    }
}
