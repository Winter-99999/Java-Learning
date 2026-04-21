package Abstract.demo2;

public class Dog extends  Animal{
    public Dog() {
        super();
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    @Override
    public void drink() {
        System.out.println("狗喝水");
    }

}
