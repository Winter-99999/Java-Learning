package Polymorphism.Practice;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog(3, "白色");
        Person p = new Person("老王", 50);
        p.KeepPet(a, "骨头");
    }
}
