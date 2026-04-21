package Polymorphism.Practice;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String food) {
        System.out.println(getAge()+"岁大"+getColor()+"的猫在吃" + food);
    }
    public void catchMouse(){
        System.out.println(getAge()+"岁大"+getColor()+"的猫在抓老鼠");
    }
}
