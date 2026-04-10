import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        //nextInt(),接受整数
        // nextDouble(),接受浮点数
        // next() 接受字符串
        //遇到空格，制表符，回车结束
        //nextLine() 接受字符串，遇到回车结束
        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入数字：");
//        int a1=sc.nextInt();
//        System.out.println(a1);
//        System.out.println("请输入数字：");
//        int a2=sc.nextInt();
//        System.out.println(a2);

//        System.out.println("请输入字符串：");
//        String a3=sc.next();
//        System.out.println(a3);
//        System.out.println("请输入字符串：");
//        String a4=sc.next();
//        System.out.println(a4);

        System.out.println("请输入字符串：");
        String a5=sc.nextLine();
        System.out.println(a5);
        System.out.println("请输入字符串：");
        String a6=sc.nextLine();
        System.out.println(a6);
    }
}
