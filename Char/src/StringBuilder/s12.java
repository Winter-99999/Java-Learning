package StringBuilder;
import java.util.Scanner;
public class s12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.nextLine();

        StringBuilder sb=new StringBuilder();
        sb.append(str);
        sb.reverse();
        String result=sb.toString();
        if(str.equals(result)){
            System.out.println("是回文");
        }else{
            System.out.println("不是回文");
        }
    }
}
