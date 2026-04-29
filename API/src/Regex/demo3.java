package Regex;

public class demo3 {
    public static void main(String[] args) {
        //  X? 一次或0次
        System.out.println("a".matches("a?"));  // true
        System.out.println("aa".matches("a?"));  // false
        //  X* 0次或多次  >=0
        System.out.println("b".matches("a*"));   // true
        System.out.println("a".matches("a*"));  // true
        System.out.println("aa".matches("a*"));  // true
        //  X+ 一次或多次   >=1
        System.out.println("b".matches("a+"));  // false
        System.out.println("a".matches("a+"));  // true
        System.out.println("aa".matches("a+"));  // true
        //  X{n}   正好n次
        System.out.println("a".matches("a{2}"));  // false
        System.out.println("aa".matches("a{2}"));  // true
        System.out.println("aaa".matches("a{2}"));  // false
        //  X{n,}   >=n次
        System.out.println("a".matches("a{2,}"));  // false
        System.out.println("aaa".matches("a{2,}"));  // true
        //  X{n,m}  >=n<=m次
        System.out.println("a".matches("a{2,3}"));  // false
        System.out.println("aaa".matches("a{2,3}"));  // true
        System.out.println("aaaa".matches("a{2,3}"));  // false
    }
}
