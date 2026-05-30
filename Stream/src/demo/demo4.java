package demo;

import java.util.stream.Stream;

public class demo4 {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5).forEach(i -> System.out.println(i));
        System.out.println("----------");
        Stream.of("hello", "world", "java").forEach(s -> System.out.println(s));
    }
}
