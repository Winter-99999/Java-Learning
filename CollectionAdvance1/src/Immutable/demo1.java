package Immutable;

import java.util.List;

public class demo1 {
    public static void main(String[] args) {
        //不可变集合 只能进行查询
        List<Integer> integers = List.of(1, 2, 3);
        for (Integer i : integers) {
            System.out.println(i);
        }
        System.out.println(integers.get(0));
    }
}
