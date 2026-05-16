package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class collectiondemo3 {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("a");
        coll.add("aa");
        coll.add("aaa");
        //增强for循环 遍历集合
        //修改for中的变量，集合中的数据不会改变
        for (String s : coll) {
            System.out.println( s);
        }
        //Lambda表达式
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        coll.forEach(s-> System.out.println(s));
    }
}
