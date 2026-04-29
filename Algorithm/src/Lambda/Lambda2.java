package Lambda;

public class Lambda2 {
    public static void main(String[] args) {
        //Lambda可以用来简化匿名内部类的写法
        //只能简化函数式接口的匿名内部类写法
        //函数式接口 只有一个抽象函数的接口，接口上方可加@functionalInterface注解

        method(new Swim() {
            @Override
            public void swiming() {
                System.out.println("游泳");
            }
        });

        method(()->{
            System.out.println("游泳.");
        });
    }
    public static void method(Swim s){
        s.swiming();
    }
}
@FunctionalInterface
 interface Swim{
    public abstract void swiming();
}
