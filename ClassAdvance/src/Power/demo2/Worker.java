package Power.demo2;
import Power.demo1.Person;


public class Worker extends Person {

    public Worker() {
        super();
    }

    public Worker(String name, int age, String sex, String job) {
        super(name, age, sex, job);
    }

    public void showSex(){
        System.out.println(sex);
    }
}
