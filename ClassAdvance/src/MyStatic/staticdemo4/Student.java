package MyStatic.staticdemo4;

public class Student {
    public String name;
    public int age;
    public String sex;
    public static String teacherName;  //静态成员变量在堆区
    public Student() {
    }

    //非静态方法既能访问静态成员变量，也能访问非静态成员变量
    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public  void show1(){
        System.out.println("姓名"+name+"  年龄："+age+"  性别："+sex);
        //调用其他方法
        show2();   //this.show2();
        method();
    }
    public void show2(){
        System.out.println("show2");
    }
    //静态方法没有this，静态方法只能访问静态成员变量
    public  static void method(){
        System.out.println("静态方法");
    }
}
