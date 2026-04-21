package Power.demo2;
import Power.demo1.Person;

public class Test2 {
    public static void main(String[] args) {
        Worker w=new Worker("王",18,"男","worker");
        w.showSex();
        Person p=new Worker("王",25,"男","teacher");
        System.out.println(p.job);
    }
}
