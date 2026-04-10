package c0;
import java.util.Scanner;
public class string3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=new String();
        System.out.println("请输入一个字符串");
        s1=sc.next();
        for(int i=0;i<s1.length();i++){
            System.out.println(s1.charAt(i));
        }

    }
}
