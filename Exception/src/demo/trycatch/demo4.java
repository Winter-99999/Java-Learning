package demo.trycatch;

public class demo4 {
    public static void main(String[] args) {
        //try-catch处理异常
        int []arr={1,2,3};
        try{
            //可能会出现异常的代码
            System.out.println(arr[3]);
            /*此处出现了异常 会创建一个异常对象
            new ArrayIndexOutOfBoundsException();
            拿着这个异常对象，交给catch看能否匹配
            如果catch能接收到这个异常对象，那么执行catch块中的代码
            catch块中的代码执行完毕后，程序继续往下执行
            */
        }catch (ArrayIndexOutOfBoundsException e){
            //处理异常的代码
            System.out.println("数组越界异常");
        }
        System.out.println("程序继续执行");
    }
}
