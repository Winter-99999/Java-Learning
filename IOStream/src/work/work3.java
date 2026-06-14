package work;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class work3 {
    public static void main(String[] args) throws IOException {
        //根据文件中的用户信息 实现登录功能
        BufferedReader br;
        try {
             br = new BufferedReader(new FileReader("src\\work\\userinfo.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.next();
        System.out.println("请输入密码：");
        String pwd = sc.next();
        boolean flag = false;
        String str;
        while ((str = br.readLine()) != null) {
            String[] info = str.split("&");
            String userName = info[0].split("=")[1];
            String password = info[1].split("=")[1];
            if (name.equals(userName) && pwd.equals(password)) {
                System.out.println("登录成功！");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("登录失败！");
        }
        br.close();
        sc.close();
    }
}
