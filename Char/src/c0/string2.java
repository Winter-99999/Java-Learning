package c0;

import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
        String rusername="admin";
        String rpassword="123456";
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名");
        String username=sc.next();
        System.out.println("请输入密码");
        String password=sc.next();
        boolean flag=false;
        int i=3;
        while (!flag){
        if((username.equals(rusername))&&(password.equals(rpassword))){
            System.out.println("登录成功");
            flag=true;
        }else {
            System.out.println("用户名或密码错误");
            System.out.println("您还有"+i+"次机会");
            i--;
            System.out.println("请重新输入");
            System.out.println("请输入用户名");
            username=sc.next();
            System.out.println("请输入密码");
            password=sc.next();
            if(i==0){
                System.out.println("您已输入错误3次，请重新登录");
                flag=true;
            }
        }
      }
    }
}
