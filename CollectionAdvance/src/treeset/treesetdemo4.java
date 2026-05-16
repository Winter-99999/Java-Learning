package treeset;

import java.util.TreeSet;

public class treesetdemo4 {
    public static void main(String[] args) {
        Student2 s1=new Student2("小王",18,80,90,80);
        Student2 s2=new Student2("小飞",18,50,70,100);
        Student2 s3=new Student2("小五",19,85,93,84);
        Student2 s4=new Student2("小赵",18,90,80,90);
        TreeSet<Student2> treeSet = new TreeSet<>();
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        for (Student2 s : treeSet) {
            System.out.println(s);
        }
    }
}
