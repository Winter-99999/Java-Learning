package InnerClass.demo2;

public class Test2 {
    public static void main(String[] args) {
        Outer.Inner inner=new Outer(5).new Inner();
        inner.show();
        Outer.Inner i=new Outer(10).getInner();
        i.show();
    }
}
