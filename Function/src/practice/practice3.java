package practice;

import java.util.ArrayList;

public class practice3 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("张三",19));
        list.add(new Student("李四",18));
        list.add(new Student("王五",20));
        String[] array = list.stream().map(s-> s.getName()+"-"+s.getAge()).toArray(String[]::new);
        for (String s : array) {
            System.out.println(s);
        }
    }
}
