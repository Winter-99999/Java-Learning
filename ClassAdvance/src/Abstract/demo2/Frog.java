package Abstract.demo2;

public class Frog extends  Animal{
    public Frog() {
    }
    public Frog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("青蛙吃虫");
    }
    @Override
    public void drink() {
        System.out.println("青蛙喝水");
    }
}
