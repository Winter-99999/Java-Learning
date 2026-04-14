import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Signin {
    public static void main(String[] args) {
        System.out.println("欢迎来到登录页面");
        ArrayList<User> users=new ArrayList<User>();
        //测试登陆成功能否正常运行
        User u1=new User("admin","123456","123456789012345695","12345678901");
        users.add(u1);
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
                for (int i = 0; i < 3; i++) {
                    if(passwordContract(users,name,password)){
                        System.out.println("登录成功");
                        break;
                    }else{
                        System.out.println("密码错误");
                        if(i==2){
                            System.out.println("登录失败");
                            break;
                        }
                        System.out.println("您还有"+(2-i)+"次机会");
                        System.out.println("请输入密码");
                        password=sc.next();
                    }
                }
                System.out.println("是否修改密码");
                System.out.println("1.是");
                System.out.println("2.否");
                int choice=sc.nextInt();
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
                            return;
                        }
                        if(!newPassword.equals(confirmNewPassword)){
                            System.out.println("密码不一致");
                            return;
                        }
                        System.out.println("修改成功");
                        users.get(getIndex(users,name)).setPassword(newPassword);
                    }
                }
            }
        }


    }
    //判断用户是否存在
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
    //获取用户在数组中的下标
    public static int getIndex(ArrayList<User> users,String name){
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;    //不存在返回-1
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
    public static  boolean passwordContract(ArrayList<User> users,String name,String password){
        for (int i = 0; i < users.size(); i++) {
            if(getIndex(users,name)!=-1&&users.get(i).getPassword().equals(password)){
                return true;
            }
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
    public static boolean contract(ArrayList<User> users,String idcard,String phone){
        boolean flag1=false;
        if(idcardReasonable(idcard)&&phoneReasonable(phone)){
            flag1=true;
        }
        boolean flag2=false;
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getIdcard().equals(idcard)&&users.get(i).getPhone().equals(phone)){
                flag2=true;
                break;
            }
        }
        return flag1&&flag2;
    }
}
