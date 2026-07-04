package method;

public class method5 {
    public static void main(String[] args) {
        MethodThread2 t1 = new MethodThread2();
        MethodThread2 t2 = new MethodThread2();
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
