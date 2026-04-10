package b;

public class b1 {
    public static void main(String[] args) {
        String []array=new String[10];
        array[0]="wzj";
        System.out.println(array[0]);
        System.out.println(array[1]);  //默认初始化值为null
        //整数默认初始值为0，浮点数默认初始值为0.0，布尔默认初始值为false，字符默认初始值为\u0000，引用类型默认初始值为null
        char[] a1=new char[5];
        System.out.println(a1[0]);
    }
}
