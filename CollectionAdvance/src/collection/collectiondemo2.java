package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectiondemo2 {
    public static void main(String[] args) {
        //遍历Collection
        Collection<String> coll=new ArrayList<>();
        coll.add("hello");
        coll.add("world");
        coll.add("java");
        //迭代器遍历
        //报错NoSuchElementException，当遍历完毕后，再调用next()会报错
        //遍历完毕后，指针不会复位
        //在循环中只能使用一次next()
        //不能用集合的方式删除或者添加元素，否则会报错ConcurrentModificationException

        Iterator<String> it=coll.iterator();
        //hasNext() 判断当前指向的位置是否存在元素
        //next() 获取当前位置的元素并移动指针到下一个位置
        //默认指向0索引
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
            if(s.equals("world")){
                //删除元素
                //coll.remove(s);  报错
                it.remove();
            }
        }
        System.out.println( coll);   //[hello, java]
    }
}
