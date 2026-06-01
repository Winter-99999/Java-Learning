package demo.trycatch;

public class demo8 {
    public static void main(String[] args) {
        //如果try中遇到了问题，那么try下面的代码不会再运行
        try{
            System.out.println(10/0);
            System.out.println("是否执行");
            int []arr=new int[3];
            System.out.println(arr[3]);
        }catch(ArithmeticException e){
            System.out.println("除零错误");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常");
        }
        System.out.println("程序是否继续执行");
    }
}
