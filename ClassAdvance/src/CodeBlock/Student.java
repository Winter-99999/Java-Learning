package CodeBlock;

public class Student {
    private String name;
    private int age;
    //构造代码块
    //每次创建对象时，都会先执行构造代码块
    {
        System.out.println("构造代码块");
    }
    //静态代码块
    //只执行一次，类加载时执行一次
    static{
        System.out.println("静态代码块");
    }

    //构造代码块,静态代码块都先于构造方法执行
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有参构造");
    }

    public Student() {
        System.out.println("无参构造");
    }

}
