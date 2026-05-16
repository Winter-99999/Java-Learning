package hashset;

import java.util.LinkedHashSet;

public class linkedhashsetdemo1 {
    public static void main(String[] args) {
        //LinkedHashSet继承于HashSet
        //有序，不重复，无索引
        //有序，即添加的顺序和遍历的顺序一致
        //底层数据结构是哈希表+双向链表
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("hello");
        set.add("world");
        set.add("hello");
        set.add("java");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
