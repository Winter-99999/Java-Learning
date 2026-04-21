package Polymorphism.p0;

public class Student extends  Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void show(){
        System.out.println("学生姓名："+getName()+"，学生年龄："+getAge());
    }
}
