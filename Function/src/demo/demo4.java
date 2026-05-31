package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class demo4 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"火枪手，20","巨人，30","飞龙宝宝，10");
        //构造方法引用
        List<Person> newList = list.stream().map(Person::new).collect(Collectors.toList());
        for (Person person : newList) {
            System.out.println(person.getName()+"---"+person.getAge());
        }
    }
}
class Person{
    private String name;
    private int age;
    public Person(){}
    public Person(String str){
        String []arr=str.split("，");
        this.name=arr[0];
        this.age=Integer.parseInt(arr[1]);
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
