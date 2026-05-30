package demo.method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class demo7 {
    public static void main(String[] args) {
        //map 转换类型
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三-12","李四-13","王五-14","赵六-15","小七-16");
        list.stream().map(new Function<String, Integer>() {

            @Override
            public Integer apply(String s) {
                String[] split = s.split("-");
                String age=split[1];
                return Integer.parseInt(age);
            }
        }).forEach(i -> System.out.println(i));

        System.out.println("----------");
        list.stream()
                .map(s ->Integer.parseInt(s.split("-")[1]))
                .forEach(i -> System.out.println(i));
    }
}
