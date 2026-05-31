package practice;

import java.util.ArrayList;

public class practice1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("小王，20");
        list.add("小张，21");
        list.add("小李，20");
        Student[] students = list.stream().map(Student::new).toArray(Student[]::new);
        for (Student student : students) {
            System.out.println(student.getName()+"---"+student.getAge());
        }
    }
}
