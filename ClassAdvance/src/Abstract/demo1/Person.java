package Abstract.demo1;
//抽象类不一定有抽象方法，有抽象方法的类一定是抽象类
public abstract class Person {
    public String name;
    public abstract void show();
    //抽象类可以有构造方法
    //当子类创建对象时，给子类对象进行初始化
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}
