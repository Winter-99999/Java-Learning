package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class hashmappractice1 {
    public static void main(String[] args) {
        HashMap<Student,String> map=new HashMap<>();
        Student s1=new Student("张三",18);
        Student s2=new Student("李四",18);
        Student s3=new Student("王五",19);
        map.put(s1,"河北");
        map.put(s2,"天津");
        map.put(s3,"上海");
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }
    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
