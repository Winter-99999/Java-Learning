package method;
import java.util.Scanner;
//素数
import static java.lang.Math.sqrt;

public class m5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        for(int i=number1;i<=number2;i++){
            boolean flag=true;
            if(i==1) continue;
            for(int j=2;j<=sqrt(i);j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
    }
}
