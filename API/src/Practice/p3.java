package Practice;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        System.out.println(Integer.toBinaryString(number));

        StringBuilder sb=new StringBuilder();
        while (number!=0){
            int n=number%2;
            sb.append(n);
            number=number/2;
        }
        for (int i = 0; i < sb.length()/2; i++) {
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(sb.length()-1-i));
            sb.setCharAt(sb.length()-1-i,temp);
        }
        //sb.reverse();
        System.out.println(sb.toString());
    }
}
