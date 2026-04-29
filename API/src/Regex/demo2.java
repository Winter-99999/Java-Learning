package Regex;

public class demo2 {
    public static void main(String[] args) {
       //  . 匹配任意字符  只匹配一个
        System.out.println("a".matches("."));  // true
        System.out.println("1".matches("."));  // true
        System.out.println("aa".matches("."));  // false
        System.out.println("---------------");
        //  \d表示任意一个数字
        //  \\d  加转义字符
        System.out.println("1".matches("\\d"));  // true
        System.out.println("a".matches("\\d"));  // false
        System.out.println("---------------");
        //  \\D  任意一个非数字
        System.out.println("a".matches("\\D"));  // true
        System.out.println("1".matches("\\D"));  // false
        System.out.println("---------------");
        //  \\w 任意一个单词字符 字母数字下划线
        System.out.println("a".matches("\\w"));  // true
        System.out.println("1".matches("\\w"));  // true
        System.out.println("_".matches("\\w"));  // true
        System.out.println("---------------");
        //  \\W  任意一个非单词字符
        System.out.println("a".matches("\\W"));  // false
        System.out.println("@".matches("\\W"));  // true
        System.out.println("---------------");
        //  \\s  任意一个空白字符
        System.out.println(" ".matches("\\s"));  // true
        System.out.println("\t".matches("\\s"));  // true
    }
}
