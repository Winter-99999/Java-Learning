package Practice4;

import java.sql.SQLOutput;

public class StudentTset2 {
    public static void main(String[] args) {
        Student arr[] = new Student[3];
        Student stu1 = new Student("001", "王", 20);
        Student stu2 = new Student("002", "帐", 25);
        Student stu3 = new Student("003", "李", 23);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        if(getindex(arr,"002")!=-1){
            System.out.println("找到学号为"+"002"+"的学生信息");
            arr[getindex(arr,"002")]=null;
            System.out.println("已删除该学生的信息");
        }else{
            System.out.println("未找到学号为"+"002"+"的学生信息");
            System.out.println("删除失败");
        }
        show(arr);
    }
    public static int getindex(Student[] arr, String id){
        for (int i = 0; i < arr.length; i++) {
            String index=arr[i].getId();
            if(index.equals(id)){
                return i;
            }
        }
        return -1;
    }
    public static void show(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null)
                System.out.println(arr[i].getId()+" "+arr[i].getName()+" "+arr[i].getAge());
        }
    }
}
