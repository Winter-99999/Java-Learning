package System;

public class s2 {
    public static void main(String[] args) {
        //引用数据类型，子类可以赋值给父类
        Student arr1[]=new Student[3];
        arr1[0]=new Student(18,"张三");
        arr1[1]=new Student(19,"王五");
        arr1[2]=new Student(20,"李四");
        Person arr2[]=new Person[3];
        System.arraycopy(arr1,0,arr2,0,3);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i].show();
        }
    }

}
class Person{
    int age;
    String name;
    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void show(){
        System.out.println("年龄是："+age+"，姓名是："+name);
    }
}
class Student extends Person{
    public Student(int age,String name){
        super(age,name);
    }
}
