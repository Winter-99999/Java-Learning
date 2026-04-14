import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class studentSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> students=new ArrayList<>();
        ArrayList<User> users=new ArrayList<>();
        //测试登陆成功能否正常运行
        User u1=new User("admin","123456","123456789012345695","12345678901");
        users.add(u1);
        boolean flag=false;
        while (true) {
            System.out.println("请输入您的选择");
            System.out.println("1.注册");
            System.out.println("2.登录");
            String choose=sc.next();
            switch(choose){
                case "1": {
                    Register(users);
                    break;
                }
                case "2":{
                     flag=Signin(users);
                    break;
                }
                default:{
                    System.out.println("输入错误，请重新输入");
                }
            }
            if(flag){
                break;
            }
        }

        while (true){
            System.out.println("----------欢迎来到学生管理系统");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入您的选择");
            String choice=sc.next();
            switch(choice){
                case "1"-> addStudent(students);
                case "2"-> deleteStudent(students);
                case "3"-> updateStudent(students);
                case "4"-> queryStudent(students);
                case "5"-> {
                    System.out.println("退出");
                    System.exit(0);   //停止虚拟机运行
                }
                default -> System.out.println("输入错误，请重新输入");
            }
        }

    }
    //添加学生
    public  static void addStudent(ArrayList<Student> students){
        Scanner sc=new Scanner(System.in);
        String id;
        System.out.println("请输入id");
        id=sc.next();
        /*loop :while(true){
            System.out.println("请输入id");
            id=sc.next();
            if(students.size()==0) break;
            for (int i = 0; i < students.size(); i++) {
                if(students.get(i).getId().equals(id)){
                    System.out.println("该id已存在，请重新输入");
                }else{
                    break loop;
                }
            }
        }*/
        while(contains(students,id)){
            System.out.println("该id已存在，请重新输入");
            id=sc.next();
        }
        System.out.println("请输入姓名");
        String name=sc.next();
        System.out.println("请输入年龄");
        int age=sc.nextInt();
        System.out.println("请输入地址");
        String address=sc.next();
        students.add(new Student(id,name,age,address));
        System.out.println("添加成功");
    }
    //删除学生
    public  static void deleteStudent(ArrayList<Student> students){
        System.out.println("请输入要删除的学生id");
        Scanner sc=new Scanner(System.in);
        String id=sc.next();
        int flag=getIndex(students,id);
        if(flag==-1){
            System.out.println("该id不存在，删除失败");
        }else{
            students.remove(flag);
            System.out.println("删除成功");
        }
        //students.removeIf(s -> s.getId().equals(id));
    }
    //修改学生
    public  static void updateStudent(ArrayList<Student> students){
        Scanner sc=new Scanner(System.in);
        String id;
        //根据id确定需要修改的学生
        System.out.println("请输入要修改的学生id");
        id=sc.next();
        int index=getIndex(students,id);
        if(index==-1){
            System.out.println("该id不存在，修改失败");
        }else{
            Student stu=students.get(index);
            System.out.println("请输入要修改的姓名");
            String name=sc.next();
            stu.setName(name);
            System.out.println("请输入要修改的年龄");
            int age=sc.nextInt();
            stu.setAge(age);
            System.out.println("请输入要修改的地址");
            String address=sc.next();
            stu.setAddress(address);
            System.out.println("修改成功");
        }
    }
    //查询学生（遍历）
    public  static void queryStudent(ArrayList<Student> students){
        if(students.size()==0){
            System.out.println("当前无学生信息，请重新选择");
        }else{
            for (int i = 0; i < students.size(); i++) {
                Student stu=students.get(i);
                System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getAddress());
            }
        }
    }
    //判断id是否存在
    public static boolean contains(ArrayList<Student> students,String id){
        for (int i = 0; i < students.size(); i++) {
            Student stu=students.get(i);
            if(stu.getId().equals(id)){
                return true;    //存在返回true
            }
        }
        return false;  //不存在返回false
       // return getIndex(students,id)==-1?false:true;
    }
    //通过id获取在学生集合中的索引
    public static int getIndex(ArrayList<Student> students,String id){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;  //不存在返回-1
    }

    //注册
    public static void Register(ArrayList<User> users){
        System.out.println("欢迎来到注册页面");
        User user=new User();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入用户名");
            String name=sc.next();
            if(containsUser(users,name)){
                System.out.println("该用户名已存在，请重新输入");
                continue;
            }else if(!nameReasonable(name)){
                System.out.println("用户名格式不正确，请重新输入");
                continue;
            }
            user.setName(name);
            break;
        }
        while(true){
            System.out.println("请输入密码");
            String password=sc.next();
            if(!passwordReasonable(password)){
                System.out.println("密码格式不正确，请重新输入");
                continue;
            }
            System.out.println("请输入确认密码");
            String confirmPassword=sc.next();
            if(!password.equals(confirmPassword)){
                System.out.println("密码不一致，请重新输入");
                continue;
            }
            user.setPassword(password);
            break;
        }
        while (true){
            System.out.println("请输入身份证号");
            String idNumber=sc.next();
            if(!idcardReasonable(idNumber)){
                System.out.println("身份证号格式不正确，请重新输入");
                continue;
            }
            user.setIdcard(idNumber);
            break;
        }
        while(true){
            System.out.println("请输入手机号");
            String phone=sc.next();
            if(!phoneReasonable(phone)){
                System.out.println("手机号格式不正确，请重新输入");
                continue;
            }
            user.setPhone(phone);
            break;
        }
        users.add(user);
        System.out.println("注册成功");
        System.out.println("用户名："+user.getName());
        System.out.println("密码："+user.getPassword());
        System.out.println("身份证号："+user.getIdcard());
        System.out.println("手机号："+user.getPhone());
    }
    //根据用户名判断是否存在该用户
    public static boolean containsUser(ArrayList<User> users,String name){
        //如果用户集合空间为0，直接返回false
        if(users.size()==0){
            return false;
        }
        //循环查找是否存在该用户名
        for (int i = 0; i < users.size(); i++) {
            User user=users.get(i);
            if(user.getName().equals(name)){
                return true;    //存在返回true
            }
        }
        return false;  //不存在返回false
    }
    //判断姓名是否符合要求
    //长度3-15
    //只能由字母和数字组成，但不能是纯数字，不能有空格
    public static boolean nameReasonable(String name){
        if(name.length()<3||name.length()>15){
            return false;
        }
        for (int i = 0; i < name.length(); i++){
            if(name.charAt(i)==' '){
                return false;
            }
        }
        //判断是否有其他字符，如有则返回false
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)<'a'||name.charAt(i)>'z'){
                if(name.charAt(i)<'A'||name.charAt(i)>'Z'){
                    if(name.charAt(i)<'0'||name.charAt(i)>'9'){
                        return false;
                    }
                }
            }
        }
        //运行到此处说明长度符合要求，没有空格，都由字母和数字组成
        //只差判断是否为纯数字
        boolean flag=true;    //标志是否是纯数字
        for (int i = 0; i < name.length(); i++){
            if(name.charAt(i)>='a'&&name.charAt(i)<='z'){
                //一旦有字母直接令flag等于false,跳出循环
                flag=false;
                break;
            }
            if(name.charAt(i)>='A'&&name.charAt(i)<='Z'){
                flag=false;
                break;
            }
        }
        //不是纯数字返回true
        if(!flag){
            return true;
        }
        return false;
    }
    //判断密码是否合理，规定密码长度6-15
    public static boolean passwordReasonable(String password){
        if(password.length()<6||password.length()>15){
            return false;
        }
        return true;
    }
    //判断身份证号码是否合理，长度18，不能以0开头，前17为只能是数字，第18位可以是数字也可以是x或X
    public static boolean idcardReasonable(String idcard){
        if(idcard.length()!=18){
            return false;
        }
        if(idcard.charAt(0)=='0'){
            return false;
        }
        for (int i = 0; i < idcard.length()-1; i++) {
            if(idcard.charAt(i)<'0'||idcard.charAt(i)>'9'){
                return false;
            }
        }
        if(idcard.charAt(idcard.length()-1)>'0'&&idcard.charAt(idcard.length()-1)<'9'
                ||idcard.charAt(idcard.length()-1)=='x'||idcard.charAt(idcard.length()-1)=='X'){
            return true;
        }
        return false;
    }
    //判断手机号是否合理，长度11，不能以0开头，纯数字
    public static  boolean phoneReasonable(String phone){
        if(phone.length()!=11){
            return false;
        }
        if(phone.charAt(0)=='0'){
            return false;
        }
        for (int i = 0; i < phone.length(); i++) {
            if(phone.charAt(i)<'0'||phone.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }
    //登录
    public static boolean Signin(ArrayList<User> users){
    Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名");
    String name=sc.next();
        System.out.println("请输入密码");
    String password=sc.next();
        System.out.println("请输入验证码");
    String code1=getCode();
        System.out.println("验证码是"+code1);
    String code=sc.next();
        if(!containsUser(users,name)){
        System.out.println("用户名不存在");
    }else{
        if(!code.equals(code1)){
            System.out.println("验证码错误");
        }else{
            //输入密码只有三次机会
            for (int i = 0; i < 3; i++) {
                if(passwordContract(users,name,password)){
                    System.out.println("登录成功");
                    return true;
                }else{
                    System.out.println("密码错误");
                    if(i==2){
                        System.out.println("登录失败");
                        return false;
                    }
                    System.out.println("您还有"+(2-i)+"次机会");
                    System.out.println("请输入密码");
                    password=sc.next();
                }
            }
            //三次都没成功登录提示是否修改密码
            System.out.println("是否修改密码");
            System.out.println("1.是");
            System.out.println("2.否");
            int choice=sc.nextInt();
            //修改密码需要身份证号和手机号
            if(choice==1){
                System.out.println("请输入身份证号");
                String idcard=sc.next();
                System.out.println("请输入手机号");
                String phone=sc.next();
                if(contract(users,idcard,phone)){
                    System.out.println("请输入新密码");
                    String newPassword=sc.next();
                    System.out.println("请确认新密码");
                    String confirmNewPassword=sc.next();
                    if(!passwordReasonable(newPassword)){
                        System.out.println("密码格式错误");
                        return false;
                    }
                    if(!newPassword.equals(confirmNewPassword)){
                        System.out.println("密码不一致");
                        return false;
                    }
                    System.out.println("修改成功");
                    users.get(getIndex1(users,name)).setPassword(newPassword);
                }
            }
        }
    }
        return false;
}


//获取验证码，5位，由1个数字和四个字母组成，数字位置随机，字母大小写均可
public static String getCode(){
    StringBuilder sb=new StringBuilder();
    Random random=new Random();

    int index=random.nextInt(5);    //确定数字的位置
    for (int i = 0; i < 5; i++) {
        if(i==index){
            sb.append(random.nextInt(10));  //添加数字
        }
        int j=random.nextInt(2);  //0-1
        if(j==0){
            sb.append((char)(random.nextInt(26)+'a'));
        }else{
            sb.append((char)(random.nextInt(26)+'A'));
        }
    }
    return sb.toString();
}
//判断用户名和密码是否匹配
public static  boolean passwordContract(ArrayList<User> users,String name,String password){
    for (int i = 0; i < users.size(); i++) {
        if(getIndex1(users,name)!=-1&&users.get(i).getPassword().equals(password)){
            return true;
        }
    }
    return false;
}
//根据用户名获取用户在集合中的索引
    public static int getIndex1(ArrayList<User> users,String name){
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;    //不存在返回-1
    }
    //判断身份证号和手机号是否匹配，用于修改密码时的检测
    public static boolean contract(ArrayList<User> users,String idcard,String phone){
        //先判断身份证号和手机号格式是否正确
        boolean flag1=false;
        if(idcardReasonable(idcard)&&phoneReasonable(phone)){
            flag1=true;
        }
        if(!idcardReasonable(idcard)){
            System.out.println("身份证号格式错误");
        }
        if(!phoneReasonable(phone)){
            System.out.println("手机号格式错误");
        }
        //再判断是否相匹配
        boolean flag2=false;
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getIdcard().equals(idcard)&&users.get(i).getPhone().equals(phone)){
                flag2=true;
                break;
            }
        }
        //只有格式正确且匹配时才返回true
        return flag1&&flag2;
    }

}


