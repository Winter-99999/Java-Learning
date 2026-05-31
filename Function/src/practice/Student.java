package practice;

public class Student {
    private String name;
    private int age;
    public Student(){}
    public Student(String str){
        String []arr=str.split("，");
        this.name=arr[0];
        this.age=Integer.parseInt(arr[1]);
    }
    public Student(String name, int age){
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
