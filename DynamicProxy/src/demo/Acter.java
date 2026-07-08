package demo;

public class Acter implements  Act{
    String name;
    int age;

    public Acter(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String sing(String name) {
        System.out.println(this.name+"正在唱："+name);
        return "谢谢";
    }

    @Override
    public void dance(String name) {
        System.out.println(this.name+"正在跳舞");
    }
}
