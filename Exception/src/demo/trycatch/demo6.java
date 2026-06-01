package demo.trycatch;

public class demo6 {
    public static void main(String[] args) {
        //如果try中遇到多个问题 那么需要多个catch块与之对应 但只会捕获第一个异常
        //如果这些异常有继承关系，需要将父类写在最后面
        int arr[]={1,2,3};
        try{
            System.out.println(10/0);
            System.out.println(arr[3]);
        }
        catch (ArithmeticException e){
            System.out.println("除零错误");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        }catch(Exception e){
            System.out.println("其他错误");
        }
        System.out.println("程序是否继续执行");
    }
}
