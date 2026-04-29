package Integer;

public class demo3 {
    public static void main(String[] args) {
        Integer i1=10;
        String s1 = Integer.toBinaryString(i1);  //二进制
        System.out.println(s1);
        String s2=Integer.toOctalString(i1);   //八进制
        System.out.println(s2);
        String s3=Integer.toHexString(i1);   //十六进制
        System.out.println(s3);

        int i4 = Integer.parseInt("15");   //只能是数字
        System.out.println(i4);
        //8种基本类型 除了Character，其他都有parse方法，进行类型转换
        String a="22";
        int ai = Integer.parseInt(a);
        System.out.println(ai);
    }
}
