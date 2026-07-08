package reflectdemo.demo1;

public class demo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取Class对象
        //第一种方式 Class.forName("全类名") 全类名=包名+类名
        Class c1 = Class.forName("reflectdemo.demo1.Student");

        //第二种方式 类名.class
        Class c2 = Student.class;

        //第三种方式 对象.getClass()
        Student s1 = new Student();
        Class c3 = s1.getClass();

        System.out.println(c1);     //demo.demo1.Student
        System.out.println(c1 == c2);
        System.out.println(c1 == c3);

    }
}
