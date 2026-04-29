package Regex;

public class demo4 {
    public static void main(String[] args) {
        //身份证号
        String regex="[\\d&&[^0]]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\dXx]";
        System.out.println("15624819560214351x".matches(regex));
        //忽略大小写
        System.out.println("aBc".matches("(?i)abc"));  //忽略abc的大小写  true
        System.out.println("aBc".matches("a((?i)b)c"));  //忽略b的大小写  true
    }
}
