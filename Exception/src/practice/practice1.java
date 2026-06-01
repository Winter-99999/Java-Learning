package practice;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student s=new Student();
        while(true){
            try {
                System.out.println("请输入姓名");
                String name = scanner.nextLine();
                System.out.println("请输入年龄");
                String age = scanner.nextLine();
                s.setName(name);
                s.setAge(Integer.parseInt(age));
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入的年龄格式有误");
            } catch (RuntimeException e) {
                System.out.println("姓名长度不符合要求或年龄范围不符合要求");
            }
        }
        System.out.println(s.toString());
    }
}
