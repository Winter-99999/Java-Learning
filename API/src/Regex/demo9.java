package Regex;

public class demo9 {
    public static void main(String[] args) {
        String regex="(.)\\1+";
        System.out.println("我我是小小小学生".replaceAll(regex, "$1"));  //$1  第一组的内容

    }
}
