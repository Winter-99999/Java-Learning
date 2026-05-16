package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class listdemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //遍历List
        //迭代器
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.print(i + " ");
        }
        System.out.println();
        //增强for循环
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Lambda表达式
        list.forEach(integer ->
                System.out.print(integer + " ")
        );
        System.out.println();
        //普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        //列表迭代器
        //继承于迭代器 可以在迭代过程中添加元素，删除元素，修改元素
        ListIterator<Integer> lit = list.listIterator();
        while (lit.hasNext()) {
            Integer i = lit.next();
            if (i == 2) {
                lit.add(4);   //在2之后添加4
            }
            System.out.print(i + " ");
        }
        System.out.println();
        //反向迭代
        while (lit.hasPrevious()) {
            Integer i = lit.previous();
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(list);   //[1, 2, 4, 3]
    }
}
