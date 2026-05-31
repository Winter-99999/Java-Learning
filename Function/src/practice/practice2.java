package practice;

import java.util.ArrayList;
import java.util.function.Predicate;

public class practice2 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("张三",19));
        list.add(new Student("李四",18));
        list.add(new Student("王五",20));
        Integer[] array = list.stream().map(Student::getAge).toArray(Integer[]::new);
        for (Integer integer : array) {
            System.out.println(integer);
        }
    }
}
