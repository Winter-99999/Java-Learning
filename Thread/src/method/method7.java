package method;

public class method7 {
    public static void main(String[] args) {
        MethodThread3 t1 = new MethodThread3();
        MethodThread3 t2 = new MethodThread3();
        MethodThread3 t3 = new MethodThread3();
        t1.setPriority(3);
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}
