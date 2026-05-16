package generics;

import java.util.ArrayList;

public class genericsdemo2 {
    public static void main(String[] args) {
        MyArrayList<Integer> mylist=new MyArrayList<>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        System.out.println(mylist.get(0));
        System.out.println(mylist);

        ArrayList<Integer> list=new ArrayList<>();
        ListUtil.addAll(list,1,2);
        System.out.println(list);

        //泛型接口的两种实现方法
        //实现类确定类型
        //public class MyArrayList implements List<Integer>{}
        //实现类不确定类型，继续沿用泛型，创建对象时才确定类型
        //public class MyArrayList<E> implements List<E>{}

    }
}
