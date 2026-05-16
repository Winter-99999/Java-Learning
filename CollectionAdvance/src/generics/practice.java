package generics;

import java.util.ArrayList;

public class practice {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("小五",5));
        animals.add(new hashiqi("小七",3));
        keepPet(animals);
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new chaiquan("旺财",5));
        keepDog(dogs);
    }
    //可以传递所有动物 但不能传递其他类型
    public static void keepPet(ArrayList<? extends Animal> pets){
        for (Animal pet : pets) {
            pet.eat();
        }
    }
    //可以传递所有狗 但不能传递猫
    public static void keepDog(ArrayList<? extends Dog> dogs){
        for (Dog dog : dogs) {
            dog.eat();
        }
    }
    //可以传递所有猫 但不能传递狗
    public static void keepCat(ArrayList<? extends Cat> cats){
        for (Cat cat : cats) {
            cat.eat();
        }
    }
}
abstract class Animal{
    String name;
    int age;

    public abstract void eat();

}
class Dog extends Animal{
    public Dog() {
    }
    public Dog(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void eat(){
        System.out.println("狗在吃饭");
    }
}
class Cat extends Animal{

    public Cat(){}
    public Cat(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void eat(){
        System.out.println("猫在吃饭");
    }
}
class chaiquan extends Dog{
    public chaiquan(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat(){
        System.out.println("一只叫做"+this.name+"的柴犬在吃狗粮");
    }
}
class hashiqi extends Dog{
    public hashiqi(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat(){
        System.out.println("这只叫做"+this.name+"的哈士奇在吃骨头");
    }
}
class bosimao extends Cat{
    public bosimao(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat(){
        System.out.println("这只叫做"+this.name+"的波斯猫在吃黄花鱼");
    }
}
class lihuamao extends Cat{
    public lihuamao(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat(){
        System.out.println("这只叫做"+this.name+"的狸花猫在吃草鱼");
    }
}
