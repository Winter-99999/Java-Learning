package demo.method;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class demo9 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三-男-12","张三-男-12","李四-女-13","王五-男-14","赵六-女-15","小七-男-16");
        //collect
        //转换为list
        List<String> collect1 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(collect1);
        //转换为set
        Set<String> collect2 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(collect2);
        //转换为map
        //键不能重复 否则会报错
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张三-男-12","李四-女-13","王五-男-14","赵六-女-15","小七-男-16");

        /*
        toMap 第一个参数 生成键的规则 第二个参数 生成值的规则
        键不能重复
        第一个Function 第一个参数 流中的数据类型 第二个参数 键的类型
        返回值 返回生成的键
        第二个Function 第一个参数 流中的数据类型 第二个参数 值的类型
        返回值 返回生成的值
        */
        Map<String, Integer> collect3 = list1.stream().
                filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {
                                              @Override
                                              public String apply(String s) {
                                                  return s.split("-")[0];
                                              }
                                          },
                        new Function<String, Integer>() {
                            @Override
                            public Integer apply(String s) {
                                return Integer.parseInt(s.split("-")[2]);
                            }
                        }));
        System.out.println(collect3);
        Map<String, Integer> collect4 = list1.stream().
                filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s ->s.split("-")[0],
                        s ->Integer.parseInt(s.split("-")[2])));
        System.out.println(collect4);

    }
}
