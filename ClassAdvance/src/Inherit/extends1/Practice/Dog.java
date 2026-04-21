package Inherit.extends1.Practice;

public class Dog extends Animal {
    String name="dog";
    public void eat(){
        System.out.println(this.name+"吃狗粮");
    }
    public void lookhome(){
        System.out.println(name+"看家");
    }

}
