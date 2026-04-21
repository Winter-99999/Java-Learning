package CodeBlock;

public class Test {

    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student("li",14);
        //局部代码块
        {
            int a=10;
            System.out.println(a);   //10
        }
        int a=20;
        System.out.println(a);     //20

    }
}
