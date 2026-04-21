package Abstract.demo1;
//重写抽象类的所有抽象方法
public class Student extends Person{
    public Student(String name){
        super(name);
    }

    public Student() {
    }

    @Override
    public void show() {
        System.out.println("学生 "+name);
    }
}
