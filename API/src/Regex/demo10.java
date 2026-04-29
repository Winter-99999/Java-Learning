package Regex;

public class demo10 {
    public static void main(String[] args) {
        //默认是捕获分组 组号从1开始 以左括号为基准
        //非捕获分组
        //()不占用组号
        //  ?=  ?!  ?:  都是非捕获分组
        String regex="[0-9]\\d(?:\\d|x|X)";
        System.out.println("12x".matches(regex));
    }
}
