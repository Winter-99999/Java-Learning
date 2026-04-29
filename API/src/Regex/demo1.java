package Regex;
// 正则表达式
public class demo1 {
    public static void main(String[] args) {
        //[abc]  abc中任意一个
        System.out.println("a".matches("[abc]"));   // true
        System.out.println("d".matches("[abc]"));   // false
        System.out.println("ab".matches("[abc]"));  // false
        System.out.println("---------------");
        //[^abc]  除了abc中任意一个
        System.out.println("d".matches("[^abc]"));   // true
        System.out.println("a".matches("[^abc]"));   // false
        System.out.println("1".matches("[^abc]"));   // true
        System.out.println("---------------");
        //[a-z]  a-z中的任意一个
        System.out.println("a".matches("[a-z]"));   // true
        System.out.println("---------------");
        //[a-zA-Z]  a-z或A-Z中的任意一个
        System.out.println("a".matches("[a-zA-Z]"));  // true
        System.out.println("B".matches("[a-zA-Z]"));  // true
        System.out.println("---------------");
        //[0-9]  0-9中的任意一个
        System.out.println("1".matches("[0-9]"));   // true
        System.out.println("a".matches("[0-9]"));   // false
        System.out.println("---------------");
        //[a-d[m-p]]  a-d或m-p中的任意一个
        System.out.println("a".matches("[a-d[m-p]]"));  // true
        System.out.println("m".matches("[a-d[m-p]]"));  // true
        System.out.println("z".matches("[a-d[m-p]]"));  // false
        System.out.println("---------------");
        //[a-z&&[def]]  a-z中d,e,f中的一个 a-z与[def]中任意一个  写一个&就不是逻辑与，只是一个符号
        System.out.println("d".matches("[a-z&&[def]]"));  // true
        System.out.println("e".matches("[a-z&&[def]]"));  // true
        System.out.println("&".matches("[a-z&[def]]"));   //true
        System.out.println("---------------");
        //[a-z&&[^def]]  a-z中除了d,e,f中的一个 a-z与[^def]中任意一个
        System.out.println("d".matches("[a-z&&[^def]]"));  // false
        System.out.println("a".matches("[a-z&&[^def]]"));  // true
        System.out.println("---------------");
        //[a-z&&[^m-p]]  a-z中除了m-p中的一个 a-z与[^m-p]中任意一个
        System.out.println("m".matches("[a-z&&[^m-p]]"));  // false
        System.out.println("a".matches("[a-z&&[^m-p]]"));  // true
        System.out.println("---------------");
    }
}
