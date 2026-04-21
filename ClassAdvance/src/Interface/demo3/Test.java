package Interface.demo3;

public class Test {
    public static void main(String[] args) {
        InterImp i = new InterImp();
        i.show();
        inter.show1();   // 静态方法只能通过接口名调用，不能通过对象调用
        inter3.show2();
        i.show1();
    }
}
