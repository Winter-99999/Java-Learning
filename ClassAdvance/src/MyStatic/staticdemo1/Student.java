package MyStatic.staticdemo1;

public class Student {
    private String name;
    private int age;
    private String sex;
    //静态成员变量，所有对象共用，随着类的加载而创建，在堆内存中只创建一个对象，优先于对象存在
    public static String teacherName;
    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public  static String getTeacherName() {
        return teacherName;
    }

    public  static void setTeacherName(String teacherName) {
        Student.teacherName = teacherName;
    }

    public void show(){
        System.out.println("姓名："+name+"  年龄："+age+"  性别："+sex+"  老师："+teacherName);
    }
}
