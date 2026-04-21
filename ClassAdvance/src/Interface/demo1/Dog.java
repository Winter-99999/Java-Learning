package Interface.demo1;

public class Dog extends Animal implements swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃狗粮");
    }

    @Override
    public void swim() {
        System.out.println("狗刨");
    }
}
