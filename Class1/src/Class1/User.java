package Class1;
//快捷键 alt+insert   生成构造函数，getter，setter方法
//ptg 插件
public class User {
    private String name;
    private String password;
    private String email;
    private String gender;
    private int age;
    public User() {
        //this 引用当前对象
    }
    public User(String name, String password, String email, String gender, int age){
        this.name=name;
        this.password=password;
        this.email=email;
        this.gender=gender;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
