package objectstream;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = -3726860144569352373L; //版本号 名称必须为serialVersionUID
    private String name;
    private int age;
    private transient int id;   //transient关键字表示该字段不参与序列化

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
