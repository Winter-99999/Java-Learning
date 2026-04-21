package MyStatic.staticdemo1;

public class ca0 {
    public static void main(String[] args) {
        //所有对象共用
        Student.teacherName="王老师";
        Student s1=new Student("张三", 18, "男");
        Student s2=new Student("王五", 19, "女");
        //s1.setTeacherName("wang");
        s1.show();
        s2.show();

    }

}
