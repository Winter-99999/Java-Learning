package Package_.Test;

import Package_.domain1.Teacher;

public class test {
    public static void main(String[] args) {
        Student s = new Student();     //在一个包中不需要导包
        String name = "aaa";           //使用java.lang包下的类，不需要导包
        //其他情况都需要导包
        Teacher t = new Teacher();     //不在一个包中需要导包
        //如果需要不同包中的类名相同的类，最好使用全类名
        //全类名 ： 包名+类名
        Package_.domain2.Teacher t2 = new Package_.domain2.Teacher();
    }
}
