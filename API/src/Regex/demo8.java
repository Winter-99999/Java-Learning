package Regex;

public class demo8 {
    public static void main(String[] args) {

        String s1="a123a";
        String s2="b6u8b";
        String s3="12584";
        String s4="*ws8*";
        //判断一个字符串首尾是否一致  只看一个字符
        String regex1="(.).+\\1";
        System.out.println(s1.matches(regex1));
        System.out.println(s2.matches(regex1));
        System.out.println(s3.matches(regex1));
        System.out.println(s4.matches(regex1));
        System.out.println("-------");
        //判断一个字符串开始部分和结束部分是否一致  可以有多个字符
        String regex2="(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));
        System.out.println("12wuwu12".matches(regex2));
        System.out.println("9oht77".matches(regex2));
        System.out.println("-------");
        //判断一个字符串开始部分和结束部分是否一致  且字符必须一致
        String regex3="((.)\\2*).+\\1";
        System.out.println("aaaa123aaaa".matches(regex3));
        System.out.println("aaaa123aaabb".matches(regex3));

    }
}
