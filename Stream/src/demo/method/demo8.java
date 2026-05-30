package demo.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class demo8 {
    public static void main(String[] args) {
        //forEach
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "hello", "world", "java","object","head");
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("----------");
        //count 统计个数
        long count = list.stream().count();
        System.out.println(count);
        System.out.println("----------");
        //toArray
        Object[] array = list.stream().toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("----------");
        //toArray 形参表示创建一个指定类型的数组
        //返回装着流中所有数据的数组
        String[] array1 = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(array1));
        System.out.println("----------");
        String[] array2 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(array2));
    }
}
