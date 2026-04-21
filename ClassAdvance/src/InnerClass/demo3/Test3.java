package InnerClass.demo3;

public class Test3 {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer.Inner();
        oi.show1();    //非静态方法
        Outer.Inner.show2();   //静态方法
    }
}
