import java.util.ArrayList;
import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        System.out.println("欢迎来到注册页面");
        ArrayList<User> users=new ArrayList<>();
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
    public static boolean containsUser(ArrayList<User> users,String name){
        if(users.size()==0){
            return false;
        }
        for (int i = 0; i < users.size(); i++) {
            User user=users.get(i);
            if(user.getName().equals(name)){
                return true;    //存在返回true
            }
        }
        return false;  //不存在返回false
    }
    public static boolean nameReasonable(String name){
        if(name.length()<3||name.length()>15){
            return false;
        }
        for (int i = 0; i < name.length(); i++){
            if(name.charAt(i)==' '){
                return false;
            }
        }
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)<'a'||name.charAt(i)>'z'){
                if(name.charAt(i)<'A'||name.charAt(i)>'Z'){
                   if(name.charAt(i)<'0'||name.charAt(i)>'9'){
                    return false;
                   }
                }
            }
        }
        boolean flag=true;
        for (int i = 0; i < name.length(); i++){
            if(name.charAt(i)>='a'&&name.charAt(i)<='z'){
                flag=false;
                break;
            }
            if(name.charAt(i)>='A'&&name.charAt(i)<='Z'){
                flag=false;
                break;
            }
        }
        if(!flag){
            return true;
        }
            return false;
    }
    public static boolean passwordReasonable(String password){
        if(password.length()<6||password.length()>15){
            return false;
        }
        return true;
    }
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
}
