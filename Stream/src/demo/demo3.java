package demo;

import java.util.Arrays;

public class demo3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        Arrays.stream(arr1).forEach(i -> System.out.println(i));
        System.out.println("----------");
        String[] arr2 = {"hello", "world", "java"};
        Arrays.stream(arr2).forEach(s -> System.out.println(s));
    }
}
