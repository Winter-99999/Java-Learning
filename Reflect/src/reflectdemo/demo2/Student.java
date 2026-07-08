package reflectdemo.demo2;

public class Student {
    private String name;
    private int age;

    public Student() {
    }
    public Student(int age) {
        this.age = age;
    }
    protected Student(String name) {
        this.name = name;
    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
