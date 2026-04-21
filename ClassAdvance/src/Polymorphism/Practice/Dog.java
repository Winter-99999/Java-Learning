package Polymorphism.Practice;

public class Dog extends  Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String food){
        System.out.println(getAge()+"岁大"+getColor()+"的狗在吃" + food);
    }
    public void lookHome(){
        System.out.println(getAge()+"岁大"+getColor()+"的狗看家");
    }
}
