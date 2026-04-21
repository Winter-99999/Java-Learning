package Abstract.demo1;

public class Test {
    public static void main(String[] args) {
        //Person p=new Person();   //抽象类不能创建对象
        Student s = new Student("王");
        s.show();
    }
}
