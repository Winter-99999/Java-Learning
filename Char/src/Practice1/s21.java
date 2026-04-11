package Practice1;
import java.util.Scanner;
//一个字符串，输出字符串最后一个单词的长度和内容
public class s21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // String str = scanner.nextLine();
        String str="hello world";
        for (int length = str.length()-1; length >=0; length--) {
            if(str.charAt(length)==' '){
                System.out.println(str.length()-length-1);
                System.out.println(str.substring(length+1));
                break;
            }
            if(length==0){
                System.out.println(str.length());
                System.out.println(str);
            }
        }
    }
}
