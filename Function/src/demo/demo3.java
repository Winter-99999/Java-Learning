package demo;

import java.util.ArrayList;
import java.util.Collections;

public class demo3 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list, "apple", "banana", "cherry");
        //其他类成员方法引用 对象::方法名 this::方法名 super::方法名
        //静态方法里面没有 this 所以不能用 this::方法名 super同理
//      list.stream().filter(s->s.startsWith("c")).forEach(System.out::println);
        list.stream().filter(demo3::stringOperation).forEach(System.out::println);
    }
    public static boolean stringOperation(String str){
        return str.startsWith("c");
    }
}
