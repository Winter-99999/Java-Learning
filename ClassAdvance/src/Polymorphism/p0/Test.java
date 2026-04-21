package Polymorphism.p0;

public class Test {
    public static void main(String[] args) {
        Student s=new Student("zhang",13);
        register(s);
        Teacher t=new Teacher("wang",25);
        register(t);
    }
    public static void register(Person p){
        p.show();
    }
}
