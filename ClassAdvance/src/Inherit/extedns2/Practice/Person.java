package Inherit.extedns2.Practice;

public class Person {
    String id;
    String name;
    int age;

    public Person() {
    }
    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void work(){
        System.out.println("工作");
    }
    public void eat(){
        System.out.println("吃米饭");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
