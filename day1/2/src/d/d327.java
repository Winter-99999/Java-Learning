
package d;
import java.util.Random;
import java.util.Scanner;
public class d327 {
    public static void main(String[] args) {

 /*       int n=1;
        switch(n){
            case 1 ->System.out.println("1");
            case 2 -> System.out.println("2");
            default -> System.out.println("default");
            }*/

            //回文数
            Scanner sc=new Scanner (System.in);
/*
    int number=sc.nextInt();
int temp=number;
int n1=0;
while(number!=0){
    int a=number%10;
    number=number/10;
    n1=n1*10+a;
}
        System.out.println(n1==temp?"是回文数":"不是回文数");
*/

/*int a,b;
a=sc.nextInt();
b=sc.nextInt();
int count=0;
while(a-b>=0){
    a=a-b;
    count++;
}
System.out.println("商为"+count);
System.out.println("余数为"+a);

 */
       /* int s=5;
        while(s>0){
            if(s==3) {
                s--;
                continue;   //结束本次循环，进入下一次循环
            }
            System.out.println(s);
            s--;
        }*/
        Random r=new Random();
        int number=r.nextInt(100);   //0-99
        System.out.println( number);
        int number1=r.nextInt(49)+2; //2-50
        System.out.println( number1);
        int number2=r.nextInt(100)+1;  //1-100
        System.out.println( number2);
        }
    }

