package hashset;

import java.util.HashSet;

public class hashsetdemo2 {
    public static void main(String[] args) {
        //哈希集合会自动创建一个长度为16的数组，当数组的元素个数达到数组长度的0.75时，会扩容为原来的2倍
        //添加元素时会计算数组元素的哈希值，将哈希值与数组的长度进行取模运算，得到索引值
        //索引值对应的数组元素为null，则将元素添加到索引位置
        //索引值对应的数组元素不为null， 在添加之前，会先比较新元素和已有元素的hashCode和equals方法。
        // 如果相同则覆盖（HashSet中不添加），如果不同才形成链表
        //链表长度超过8且数组长度超过64，则将链表转换为红黑树

        HashSet<Student> set = new HashSet<>();
        Student s1=new Student("小王",18);
        Student s2=new Student("小李",19);
        Student s3=new Student("小张",20);
        Student s4=new Student("小王",18);
        //如果Student类重写了hashCode和equals方法，则添加的元素会根据属性值进行判断
        //如果属性值相同，则添加失败
        //如果Student类没有重写hashCode和equals方法，则添加的元素会根据地址进行判断
        System.out.println(set.add(s1));
        System.out.println(set.add(s2));
        System.out.println(set.add(s3));
        System.out.println(set.add(s4));
        System.out.println(set);

    }
}
