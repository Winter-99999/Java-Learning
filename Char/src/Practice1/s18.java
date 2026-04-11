package Practice1;
import java.util.Scanner;
import java.util.Random;
//随机打乱字符串
public class s18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s=sc.nextLine();
        char []chs=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            int number=new Random().nextInt(s.length());//随机数
            char temp=chs[i];
            chs[i]=chs[number];
            chs[number]=temp;
            s=new String(chs);
        }
        System.out.println(s);
    }
}
