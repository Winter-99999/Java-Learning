package collection;

import java.util.ArrayList;
import java.util.Collection;

public class collectiondemo1 {
    public static void main(String[] args) {
        //Collection是一个接口
        Collection<String> collection = new ArrayList<>();
        //添加元素
        //如果往List系列集合中添加元素，方法永远返回true，因为允许数据重复
        //如果往Set系列集合中添加元素，若元素不存在则返回true，添加成功，若数据存在返回false，添加失败，因为不允许数据重复
        //
        collection.add("1");
        collection.add("2");
        collection.add("3");
        //获取容量
        System.out.println(collection.size());
        //删除元素 只能通过元素来删除
        //删除成功返回true，删除失败返回false
        //元素不存在就会删除失败
        collection.remove("2");
        //判断元素是否存在
        //底层是通过equals方法来判断的
        //如果是自定义类，则需要重写equals方法
        System.out.println(collection.contains("1"));
        //判断集合是否为空
        System.out.println(collection.isEmpty());
        //清空集合
        collection.clear();
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
    }
}
