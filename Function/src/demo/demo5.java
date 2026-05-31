package demo;

import java.util.ArrayList;

public class demo5 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        /*
        类名引用成员方法
        需要有函数式接口
        被引用的方法必须已经存在
        被引用方法的形参需要与抽象方法的第二个形参到最后一个形参一致
        被引用方法的返回值类型需要与抽象方法的返回值类型一致
        被引用方法的功能需要满足当前需求
        局限性 只能引用第一个参数的类型的成员方法
        */

        /*
        * 抽象方法形参
        * 第一个参数 表示被引用方法的调用者，决定了可以引用哪些类的成员方法
        * 后面的参数跟被引用方法的形参列表一致 如果没有第二个参数，说明被引用的方法是无参方法
        * */
        //类名::方法名 stream流中数据是String类型，则只能调用String类中的方法
        //变成大写
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
