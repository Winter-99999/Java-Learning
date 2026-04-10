package c0;

public class string1 {
    public static void main(String[] args) {
        //基本数据类型比较的是值
        //引用数据类型比较的是地址
        int a=1;
        int b=2;
        //System.out.println(a==b);
        String s1="abc";    //串池
        String s2="abc";    //串池
        String s3=new String("abc");  //堆区
        String s4=new String("abc");
        String s5="a";
        //比较地址
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println(s1==s5);
        System.out.println();
        //比较内容
        System.out.println(s1.equals((s2)));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s5));
        //比较内容，不分大小写
        String s6=new String("Abc");
        System.out.println(s1.equalsIgnoreCase((s5)));

    }
}
