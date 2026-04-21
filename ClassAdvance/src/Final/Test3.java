package Final;

public class Test3 {
    public static void main(String[] args) {
        //final 修饰变量,只能赋值一次，随后不能被修改
        //final 修饰方法，不能被重写
        //final 修饰类，不能被继承
        final int a=10;
        //a=20;   不能修改
        System.out.println(a);
    }
}
