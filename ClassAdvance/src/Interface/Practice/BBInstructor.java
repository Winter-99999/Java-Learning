package Interface.Practice;

public class BBInstructor extends Instructor{
    public BBInstructor() {
    }

    public BBInstructor(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教篮球");
    }
}
