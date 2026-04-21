package Polymorphism.Practice;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void KeepPet(Animal a, String food){
        if(a instanceof Dog d){
            System.out.println(age+"岁的"+name+"养了一只"+a.getColor()+"的"+a.getAge()+"岁的狗");
            d.lookHome();
            d.eat(food);
        }else if(a instanceof Cat c){
            System.out.println(age+"岁的"+name+"养了一只"+a.getColor()+"的"+a.getAge()+"岁的猫");
            c.catchMouse();
            c.eat(food);
        }else{
            System.out.println("没有这种动物");
        }
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
