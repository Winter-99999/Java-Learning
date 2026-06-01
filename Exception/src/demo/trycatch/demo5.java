package demo.trycatch;

public class demo5 {
    public static void main(String[] args) {
        //如果try中没有遇到问题，那么catch块中的代码不会执行
        try{
            System.out.println(10/2);
        }catch (ArithmeticException e){
            System.out.println("除零错误");
        }
        System.out.println("程序是否继续执行");
    }
}
