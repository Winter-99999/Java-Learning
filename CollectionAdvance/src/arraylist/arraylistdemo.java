package arraylist;

import java.util.ArrayList;

public class arraylistdemo {
    public static void main(String[] args) {
        //使用空参创建ArrayList对象
        //自动生成一个容量为0的数组
        //当第一次添加元素时，会扩容到容量为10的数组
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size());    //0
        list.add(1);
        //添加元素后，size会加1
        System.out.println(list.size());    //1
        //当数组的长度到达了当前的容量时，会扩容
        //一般情况，扩容的容量是当前容量的1.5倍
        //当一次性添加多个元素时，如果添加的元素个数大于旧数组容量的一半，会直接扩容到所需要的容量
        ArrayList<Integer> list1 = new ArrayList<>();
        //把list的元素复制到list1
        list1.addAll(list);
        System.out.println(list1.size());   //1
        //添加100个元素
        for (int i = 0; i < 100; i++) {
            list1.add(i);
        }
        System.out.println(list1.size());   //101

    }
}
