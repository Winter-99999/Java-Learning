package MyStatic.staticdemo3;

import java.util.ArrayList;

public class Tset3 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("张三", 18, "男"));
        list.add(new Student("王五", 19, "女"));
        list.add(new Student("赵六", 20, "男"));
        System.out.println("学生中最大年龄为"+ListUtil.getMaxAge(list)+"岁");
    }
}
