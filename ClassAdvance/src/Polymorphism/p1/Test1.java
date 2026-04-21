package Polymorphism.p1;

public class Test1 {
    public static void main(String[] args) {
        Animal a = new Dog();
        //调用成员变量，编译看左边，运行看左边
        //编译时，看父类是否有这个变量，如果有，则编译成功，反之不成功
        //运行时，实际调用的是父类成员变量的值
        System.out.println(a.name);
        //调用成员方法，编译看左边，运行看右边
        //编译时，看父类是否有这个方法，如果有，则编译成功，反之不成功
        //运行时，实际调用的是子类成员方法
        a.show();
    }
}

class Animal {
    String name = "animal";

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Animal show");
    }
}

class Dog extends Animal {
    String name = "dog";

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("Dog show");
    }
}
