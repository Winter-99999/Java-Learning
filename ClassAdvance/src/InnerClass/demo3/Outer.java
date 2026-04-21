package InnerClass.demo3;

public class Outer {

    int a=10;
    static int b=20;

    //静态内部类是成员内部类的一种
    //静态内部类只能访问外部类的静态成员变量和方法
    //如果需要访问外部类的非静态成员变量和方法，则需要创建外部类的对象

    static class Inner{
        public void show1(){
            //System.out.println(a);  不能访问
            Outer o=new Outer();
            System.out.println(o.a);
            System.out.println(b);
            System.out.println("非静态方法");
        }
        public static void show2(){
            //System.out.println(a);  不能访问
            Outer o=new Outer();
            System.out.println(o.a);
            System.out.println(b);
            System.out.println("静态方法");
        }

    }
}
