package demo;

import java.util.HashMap;

public class demo2 {
    public static void main(String[] args) {
        //双列集合不能直接运用Stream流
        HashMap<String, Integer> map = new HashMap<>();
        map.put("hello", 1);
        map.put("world", 2);
        map.put("java", 3);
        //第一种转换方式
        map.keySet().forEach(key -> System.out.println(key));
        System.out.println("----------");
        //第二种转换方式
        map.entrySet().forEach(entry -> System.out.println(entry.getKey()));
    }
}
