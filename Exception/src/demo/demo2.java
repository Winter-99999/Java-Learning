package demo;

public class demo2 {
    public static void main(String[] args) {
        //异常作用 可以查看错误的关键信息
        int []arr=new int[3];
        //System.out.println(arr[3]); //数组下标越界异常 ArrayIndexOutOfBoundsException
        //可以作为方法内部的特定返回值 便于得知底层执行情况
        Student s=new Student();
        s.setAge(-1);  //抛出RuntimeException
    }
}
class Student{
    private String name;
    private int age;

    public Student(){}
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
        if(age<0||age>110){
            throw new RuntimeException("年龄不合理");
        }else {
            this.age = age;
        }
    }
}
