package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(sum<=200){
            String number=sc.nextLine();
            int n=Integer.parseInt(number);
            if(n<1||n>100){
                System.out.println("输入数字范围不符合要求");
                continue;
            }
            list.add(n);
            sum+=n;
            System.out.println(sum);
        }
    }
}
