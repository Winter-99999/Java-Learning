package Power.demo1;

public class Person {
    private String name;   //只能在当前类中访问
    int age;     //可以在当前类中，同一个包中的其他类中访问
    protected String sex;  //可以在不同包中的子类访问
    public String job;    //可以在任何地方访问

    public void show() {
        System.out.println("姓名："+name+"，年龄："+age+"，性别："+sex+"，工作："+job);
    }
    public Person() {
    }

    public Person(String name, int age, String sex, String job) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.job = job;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
