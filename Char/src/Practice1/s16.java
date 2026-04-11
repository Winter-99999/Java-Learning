package Practice1;

import java.util.Scanner;

public class s16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str="";
        while(true){
             str=sc.nextLine();
            if(check(str)){
                break;
            }else{
                System.out.println("输入错误，请重新输入");
            }
        }
        System.out.println(change(str));
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(change1(str.charAt(i))+" ");
        }
        System.out.println(sb.toString());

    }
    public static boolean check(String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)<'0'||str.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }
    public static String change(String str){
        String luoma[]={"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int number=str.charAt(i)-'0';
            sb.append(luoma[number]+" ");
        }
        return sb.toString();
    }
    public static String change1(char number){
        String s=switch(number){
            case '0' ->"";
            case '1' ->"I";
            case '2' ->"II";
            case '3' ->"III";
            case '4' ->"IV";
            case '5' ->"V";
            case '6' ->"VI";
            case '7' ->"VII";
            case '8' ->"VIII";
            case '9' ->"IX";
            default ->"";
        };
        return s;
    }
}
