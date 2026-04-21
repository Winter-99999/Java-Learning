package InnerClass.demo1;

public class Car {
    private String name;
    private int carage;
    private String color;
    public void show(){
        //System.out.println(name+engineage); //外部类不能直接访问内部类成员变量
        System.out.println(color+"的"+name+"车");
        Engine e=new Engine(1);   //要想访问内部类成员变量，必须创建对象
        System.out.println(e.engineage);
    }
    //内部类可以直接访问外部类成员变量
    class Engine{
        private int engineage;

        public Engine(int engineage) {
            this.engineage = engineage;
        }

        public void show(){
            System.out.println(engineage+"引擎");
        }
    }

    public Car(String name, int carage, String color) {
        this.name = name;
        this.carage = carage;
        this.color = color;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCarage() {
        return carage;
    }

    public void setCarage(int carage) {
        this.carage = carage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
