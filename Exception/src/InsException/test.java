package InsException;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student1 s=new Student1();
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
            } catch (NameFormatException e) {
                e.printStackTrace();
            } catch (AgeOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        System.out.println(s);
    }
}
