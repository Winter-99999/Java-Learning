package Interface.Practice;

public class PPInstructor extends Instructor implements English{
    public PPInstructor() {
    }

    public PPInstructor(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教乒乓球");
    }
    @Override
    public void studyEnglish() {
        System.out.println("学习英语");
    }
}
