package treeset;

import java.util.TreeSet;

public class treesetdemo2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student s1=new Student("小王",18);
        Student s2=new Student("小白",22);
        Student s3=new Student("小赵",13);
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        System.out.println(treeSet);
    }
}
