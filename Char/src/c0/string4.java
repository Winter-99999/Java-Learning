package c0;

import java.util.Scanner;

public class string4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=new String();
        System.out.println("请输入一个字符串");
        s1=sc.next();
        int bigcount=0;
        int smallcount=0;
        int numcount=0;
        int othercount=0;
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(c>='A'&&c<='Z'){
                bigcount++;
            }else if(c>='a'&&c<='z'){
                smallcount++;
            }else if(c>='0'&&c<='9'){
                numcount++;
            }else{
                othercount++;
            }
        }
        System.out.println("大写字母有"+bigcount+"个");
        System.out.println("小写字母有"+smallcount+"个");
        System.out.println("数字有"+numcount+"个");
        System.out.println("其他字符有"+othercount+"个");
    }
}
