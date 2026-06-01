package demo.trycatch;

public class demo7 {
    public static void main(String[] args) {
        //如果try中遇到的问题没有被捕获，那么会交给虚拟机处理
        try{
            System.out.println(10/0);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界");
        }
        System.out.println("程序是否继续执行");  //不会执行
    }
}
