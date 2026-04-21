package Polymorphism.p1;

public class Test2 {
    public static void main(String[] args) {
        A a=new B();
        a.show();
       //a.bb();    //不能访问，因为A类没有这个方法
        /*
        B b=(B)a;    强转，将a转换为B类型  如果转换类型错误，会抛出ClassCastException异常
        b.bb();
        */
        // instanceof 判断a是否是B类的实例，是则返回true，否则返回false
        if(a instanceof B b1){   //如果为true,则执行B b1=(B)a;
            b1.bb();
        }else if(a instanceof C c1){   //如果为true,则执行C c1=(C)a;
            c1.cc();
        }else{
            System.out.println("没有匹配的类");
        }
        A a1=new C();
        a1.show();
        if(a1 instanceof C c1){   //如果为true,则执行B b2=(B)a1;
            c1.cc();
        }
    }
}
class A{
    public void show(){
        System.out.println("A");
    }
}
class B extends A{
    public void show(){
        System.out.println("B");
    }
    public void bb(){
        System.out.println("bb");
    }
}
class C extends A{
    public void show(){
        System.out.println("C");
    }
    public void cc(){
        System.out.println("cc");
    }
}
