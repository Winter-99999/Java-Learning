package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntFunction;

public class demo6 {
    public static void main(String[] args) {
        //引用数组的构造方法
        //生成的数组类型需要与原数据类型保持一致
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Integer [] arr1=list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
        System.out.println(Arrays.toString(arr1));

        Integer [] arr2=list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr2));
    }
}
