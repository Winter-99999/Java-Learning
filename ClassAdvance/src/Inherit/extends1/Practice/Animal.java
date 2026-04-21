package Inherit.extends1.Practice;

public class Animal {
    String name="动物";

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println(name+"吃饭");
    }
    public void drink(){
        System.out.println(name+"喝水");
    }
}
