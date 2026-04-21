package Polymorphism.p0;

public class Teacher extends  Person{
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void show(){
        System.out.println("老师姓名："+getName()+"，老师年龄："+getAge());
    }
}
