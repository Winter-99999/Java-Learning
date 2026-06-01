package demo.trycatch;

public class demo9 {
    public static void main(String[] args) {
        int []arr=new int[3];
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //String message = e.getMessage();
            //System.out.println( message);
            // Index 3 out of bounds for length 3

            //String s = e.toString();
            //System.out.println(s);
            // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

            e.printStackTrace(); //打印异常信息 与虚拟机输出的异常信息一致 但不会结束程序
        }
        System.out.println("程序是否继续执行");
    }
}
