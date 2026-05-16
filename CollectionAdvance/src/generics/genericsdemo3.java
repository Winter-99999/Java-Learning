package generics;

import java.util.ArrayList;

public class genericsdemo3 {
    public static void main(String[] args) {
        //泛型不能被继承，但泛型数据可以被继承
        ArrayList<Ye> list1=new ArrayList<>();
        ArrayList<Fu> list2=new ArrayList<>();
        ArrayList<Zi> list3=new ArrayList<>();
        method1(list1);
        //method1(list2);  报错
        //method1(list3);  报错
        //当想要指定类型范围但类型不确定时，可以使用通配符
        method2(list1);
        method2(list2);
        method2(list3);
        list1.add(new Ye());
        list2.add(new Fu());  //允许
        list3.add(new Zi());  //允许
    }
    public static void method1(ArrayList<Ye> list){}
    //泛型通配符：?
    //? 可以传递任意类型
    //? extends 只能传递该类型或者该类型的子类
    //? super 只能传递该类型或者该类型的父类
    public static void method2(ArrayList<? extends Ye> list){}
}
class Ye{}
class Fu extends Ye{}
class Zi extends Fu{}

