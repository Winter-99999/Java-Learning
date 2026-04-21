package Inherit.extends0;
//继承只能单继承，但可以多层继承
//java中的类都是继承Object类，即使没有写extends Object，也隐式继承了Object类
//子类只能访问父类的非私有成员
public class Animal {
    public void eat(){
        System.out.println("吃");
    }
    public void drink(){
        System.out.println("喝");
    }

}
