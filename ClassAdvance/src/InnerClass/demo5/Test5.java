package InnerClass.demo5;

public class Test5 {
    public static void main(String[] args) {
        //匿名内部类   隐藏了名字的内部类
        //可以写在方法中，也可以写在局部位置
        Animal a=new Animal() {
            @Override
            public void eat() {
                System.out.println("吃东西");
            }
        };
        a.eat();
        new inter() {
            @Override
            public void show() {
                System.out.println("inter");
            }
        };
        method(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("吃饭");
                    }
                }
        );

    }

    public static void method(Animal a) {
        a.eat();
    }
}
