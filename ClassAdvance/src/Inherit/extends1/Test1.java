package Inherit.extends1;

public class Test1 {
    public static void main(String[] args) {
        Zi1 zi=new Zi1();
        zi.show();
    }
}
class Fu1{
    public void show(){
        System.out.println("父类方法");
    }
}
class Zi1 extends Fu1{
    public void show() {
        super.show();
        System.out.println("子类方法");
    }
}
