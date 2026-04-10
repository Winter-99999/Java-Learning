package method;
import java.util.Random;
import java.util.Scanner;
public class m9 {
    public static void main(String[] args) {
        int []a=getNumber();
        System.out.println("中奖号码：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
            if(i==6){
                System.out.println();
            }
        }
        System.out.println("请输入彩票号码：");
        Scanner sc=new Scanner(System.in);
        int []b=new int[7];
        for (int i = 0; i < b.length-1; i++) {
            System.out.println("请输入第"+(i+1)+"个红色号码：");
            b[i]=sc.nextInt();
            while(b[i]<1||b[i]>33){
                System.out.println("请输入正确的号码");
                b[i]=sc.nextInt();
            }
            for(int j = 0; j < i; j++){
                while(b[i]==b[j]){
                    System.out.println("号码重复，请重新输入");
                    b[i]=sc.nextInt();
                }
            }
        }
        System.out.println("请输入蓝色号码：");
        b[6]=sc.nextInt();
        while(b[6]<1||b[6]>16){
            System.out.println("请输入正确的号码");
            b[6]=sc.nextInt();
        }
        getPrize(a,b);

    }
    public static int[] getNumber(){
        int []a=new int[7];
        Random r=new Random();
        for (int i = 0; i < a.length-1; i++) {
            a[i]=r.nextInt(33)+1;   //1-33
            for (int j = 0; j < i; j++) {
                while(a[i]==a[j]){
                    a[i]=r.nextInt(33)+1;
                }
            }
        }
        a[6]=r.nextInt(16)+1;
        return a;
    }
    public static void getPrize(int []a,int []b){
        int count1=0;
        int count2=0;
        for (int i = 0; i < b.length-1; i++) {
            if(a[i]==b[i]){
                count1++;
            }
        }
        if(a[6]==b[6])  count2++;
        System.out.println("红色球中了"+count1+"个"+"蓝色球中了"+count2+"个");

    }
}
