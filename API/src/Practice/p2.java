package Practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p2 {
    public static void main(String[] args) {
        String regex = "[1-9]\\d{0,9}";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (!s.matches(regex)) {
            System.out.println("请重新输入");
            s = sc.nextLine();
        }
        int number = Integer.parseInt(s);
        System.out.println(number);

        String n = "123";
        System.out.println(stringToInt(n));

    }

    public static int stringToInt(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            number = number * 10 + s.charAt(i) - '0';

        }
        return number;
    }

}
