package Interface.Practice;

public class PPAthlete extends Athlete implements  English{
    public PPAthlete() {
    }

    public PPAthlete(String name, int age) {
        super(name, age);
    }
    @Override
    public void learning() {
        System.out.println("学习乒乓球");
    }
    @Override
    public void studyEnglish() {
        System.out.println("学习英语");
    }

}
