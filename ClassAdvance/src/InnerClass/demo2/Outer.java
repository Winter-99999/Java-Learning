package InnerClass.demo2;

public class Outer {
    private int a=10;

    public Outer(int a) {
        this.a = a;
    }

    //如果成员内部类访问修饰符为private，则外部类不能创建成员内部类对象
    //需要在外部类提供一个方法，返回成员内部类对象
    public Inner getInner(){
        return new Inner();
    }
     class Inner{
        private int a=20;
        public void show(){
            int a=30;
            System.out.println(a);   //30
            System.out.println(this.a);   //20
            System.out.println(Outer.this.a);   //10
        }
    }
}
