package Inherit.extedns2;

public class Student extends  Person{
    public Student(){
        super();        //必须写在第一行
        System.out.println("子类无参构造");
    }
    public Student(String name,int age){
        super(name, age);
        System.out.println("子类有参构造");
    }
}
