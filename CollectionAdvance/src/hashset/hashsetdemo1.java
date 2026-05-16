package hashset;

import java.util.HashSet;

public class hashsetdemo1 {
    public static void main(String[] args) {
        //HashSet 继承于Set
        //无序，不重复，无索引
        //哈希值  如果没有重写hashCode()方法，不同对象的哈希值一般不同
        //如果重写hashCode()方法，属性相同的对象，哈希值一般相同
        //小部分情况下，会出现哈希碰撞，即不同属性或不同地址的对象哈希值相同
        HashSet<Student> set = new HashSet<>();
        Student s1=new Student("小王",18);
        Student s2=new Student("小王",18);
        set.add(s1);
        set.add(s2);
        //Student类重写了hashCode()方法，属性相同对象的哈希值也相同
        System.out.println(s1.hashCode());  //23565815
        System.out.println(s2.hashCode());  //23565815
        //哈希碰撞
        System.out.println("abc".hashCode());  //96354
        System.out.println("acD".hashCode());  //96354
    }
}
