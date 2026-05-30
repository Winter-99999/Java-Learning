package demo.method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class demo6 {
    public static void main(String[] args) {
        //distinct 去重
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
        list1.stream().distinct().forEach(System.out::println);
        System.out.println("----------");
        //concat 连接
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2,6,7,8,9);
        Stream.concat(list1.stream(),list2.stream()).forEach(i -> System.out.println(i));
    }
}
