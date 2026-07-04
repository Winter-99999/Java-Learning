package practice.practice4;

public class p4 {
    public static void main(String[] args) {
        Thread4 t1 = new Thread4();
        Thread4 t2 = new Thread4();
        Thread4 t3 = new Thread4();
        Thread4 t4 = new Thread4();
        Thread4 t5 = new Thread4();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
