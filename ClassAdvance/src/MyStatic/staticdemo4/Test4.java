package MyStatic.staticdemo4;

public class Test4 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="张三";
        s1.age=18;
        s1.sex="男";
        s1.show1();
        Student s2=new Student("王五", 19, "女");
        s2.show1();

    }
}
