package treeset;

import java.util.TreeSet;

public class treesetdemo1 {
    public static void main(String[] args) {
        //TreeSet 继承于Set
        //有序，不重复，无索引
        //有序，即添加的顺序和遍历的顺序一致
        //TreeSet底层数据结构是红黑树
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        //自动排序 升序
        //字符和字符串按照ASCII码排序
        //数字按照大小排序
        System.out.println(treeSet);   //[1, 2, 3]
        for(Integer i:treeSet){
            System.out.println(i);
        }

    }
}
