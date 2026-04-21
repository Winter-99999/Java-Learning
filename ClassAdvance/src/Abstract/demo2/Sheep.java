package Abstract.demo2;

public class Sheep extends  Animal{
    public Sheep() {
    }
    public Sheep(String name, int age) {
        super(name, age);
    }
    public void eat() {
        System.out.println("羊吃grass");
    }
    public void drink() {
        System.out.println("羊喝水");
    }
}
