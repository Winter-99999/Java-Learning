package c1;
import java.util.Scanner;
public class s7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int moneystr;
        while(true){
            System.out.println("请输入一个金额（最大七位）");
            moneystr=sc.nextInt();
            if(moneystr<=9999999&&moneystr>=0){
                break;
            }else{
                System.out.println("输入错误，请重新输入");
            }
        }

        String result="";
        int c=6;
        while(moneystr!=0){
            int number=moneystr%10;
            result=change(number)+wei(c)+result;
            moneystr/=10;
            c--;
        }
        int count=14- result.length();
        for (int i = 0; i < count; ) {
            result="零"+wei(c)+result;
            c--;
            i+=2;
        }
        System.out.println(result);
        /*for (int i = 0; i < result.length(); i++) {
            System.out.print(result.charAt(i)+wei(i));
        }*/
        /*String re="";
        for (int i = 0; i < result.length(); i++){
            char c=result.charAt(i);
            re=re+c+wei(i);
        }
        System.out.println(re);*/
    }
    public static String change(int money){
        String arr[]={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[money];
    }
    public static String wei(int money){
        String arr[]={"佰","拾","万","仟","佰","拾","元"};
        return arr[money];
    }
}
