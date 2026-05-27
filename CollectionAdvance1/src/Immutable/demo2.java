package Immutable;

import java.util.Set;
import java.util.function.Consumer;

public class demo2 {
    public static void main(String[] args) {
        Set<Integer> integers = Set.of(1, 2, 3);  //元素不能重复
        integers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println( integer);
            }
        });
        System.out.println("----------------");

    }
}
