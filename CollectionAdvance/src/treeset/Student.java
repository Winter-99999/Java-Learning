package treeset;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //按年龄升序排序
        //负数表示当前对象年龄小于o对象 往左添加
        //0表示当前对象年龄等于o对象 不添加
        //正数表示当前对象年龄大于o对象 往右添加
        System.out.println("this: "+ this);
        System.out.println("o: "+ o);
        System.out.println();
        return this.age - o.age;
    }
}
