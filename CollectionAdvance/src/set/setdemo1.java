package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class setdemo1 {
    public static void main(String[] args) {
        //Set 是一个接口，不能实例化
        //元素不能重复
        Set<String> set = new HashSet<>();
        set.add("1");
        //set.add("1"); //重复元素不会被添加
        set.add("2");
        set.add("3");
        System.out.println(set);   //[1, 2, 3]
        //迭代器遍历
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String str= iterator.next();
            System.out.println(str);
        }
        //增强for遍历
        for (String str : set) {
            System.out.println(str);
        }
        //Lambda表达式遍历
        set.forEach(str-> System.out.println( str));
    }
}
