package InnerClass.demo4;

public class Outer {
    int b=20;
    public void show(){
        int a=10;
        //局部内部类   将类定义在方法中
        //外界不能直接访问局部内部类，需要创建对象
        //局部内部类可以访问外部类的成员变量和方法
        class Inner{
            public void show1(){
                System.out.println(a);
                System.out.println(b);
                System.out.println("非静态方法");
            }
            public static void show2(){
                System.out.println("静态方法");
            }
        }
        Inner i = new Inner();
        i.show1();
        Inner.show2();
    }

}
