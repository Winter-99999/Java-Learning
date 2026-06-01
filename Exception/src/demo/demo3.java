package demo;

public class demo3 {
    public static void main(String[] args) {
        //JVM 默认异常处理方式
        //1. 把异常的信息打印在控制台 包括异常原因，异常位置等
        //2.程序停止运行，后面的代码不会再执行
        System.out.println(1);
        System.out.println(10/0);  //ArithmeticException 算术异常
        System.out.println(2);
        System.out.println(3);
        //只会打印1
    }
}
