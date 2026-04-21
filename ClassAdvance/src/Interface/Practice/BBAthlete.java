package Interface.Practice;

public class BBAthlete extends Athlete{
    public BBAthlete() {
    }

    public BBAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void learning() {
        System.out.println("学习篮球");
    }
}
