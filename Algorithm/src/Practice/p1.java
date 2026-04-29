package Practice;

import java.util.Arrays;
import java.util.Comparator;

public class p1 {
    public static void main(String[] args) {
        Student s1=new Student("abc",18,1.80);
        Student s2=new Student("ad",19,1.5);
        Student s3=new Student("ab",18,1.7);
        Student []arr={s1,s2,s3};
        //先按年龄升序，年龄相同按身高升序，最后按名字升序
        Arrays.sort(arr, (Student o1, Student o2)-> {
            double temp=o1.getAge()-o2.getAge();
            temp=temp==0?o1.getHeight()-o2.getHeight():temp;
            temp=temp==0?o1.getName().compareTo(o2.getName()):temp;
            if(temp>0){
                return 1;
            }else if(temp<0){
                return -1;
            }else{
                return 0;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName()+" "+arr[i].getAge()+" "+arr[i].getHeight());
        }
    }
}
class Student{
    String name;
    int age;
    double height;

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
