public class add {
    public static void main(String[] args) {
        System.out.println(1+"23");     //加法出现字符串时加法就变成了字符运算符
        System.out.println(1+2+"wowo");   //连续加时从左到右逐个执行
        System.out.println("abc"+'我'+true);
        System.out.println("-------------");
        int age=18;
        System.out.println("我"+age+"岁了");
        System.out.println("我"+"age"+"岁了");
        System.out.println("-------------");
        System.out.println(1+2+"abc"+1+2);
        System.out.println("-------------");
        System.out.println(1+'a');
    }
}
