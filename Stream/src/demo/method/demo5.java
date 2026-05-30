package demo.method;

import java.util.ArrayList;
import java.util.Collections;

public class demo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "hello", "world", "java","object","head");
        //filter 按要求过滤
        list.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
        System.out.println("----------");
        list.stream().filter(s -> s.startsWith("h")).forEach(s -> System.out.println(s));
        System.out.println("----------");
        list.stream().filter(s -> s.endsWith("d")).forEach(s -> System.out.println(s));
        System.out.println("----------");
        //limit 获取前几个元素
        list.stream().limit(2).forEach(s -> System.out.println(s));
        System.out.println("----------");
        //skip 跳过前几个元素
        list.stream().skip(2).forEach(s -> System.out.println(s));
        System.out.println("----------");
        list.stream().skip(2).limit(2).forEach(s -> System.out.println(s));
    }
}
