package Class;

public class Girlfriend {
    private String name;
    private int age;
    private String gender;
    public void show(){
        System.out.println("姓名是"+name+" "+"年龄是"+age+" "+"性别是"+gender);
    }
    public void SetName(String name){
        this.name=name;
    }
    public String GetName(){
        return name;
    }
    public void SetAge(int age){
        if(age<18||age>30){
            System.out.println("年龄不符合要求");
            return;
        }
        this.age=age;
    }
    public int GetAge(){
        return age;
    }
    public void SetGender(String gender){
        this.gender=gender;
    }
    public String GetGender(){
        return gender;
    }
}
