package demo;

import java.util.ArrayList;

public class demo2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        //静态方法引用
        list.stream().map(Integer::parseInt).forEach(System.out::println);
    }
}
