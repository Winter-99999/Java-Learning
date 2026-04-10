package method;


import java.util.Random;

public class m6 {
    public static void main(String[] args) {
        char[] chars=new char[52];
        for(int i=0;i<chars.length;i++){
            if(i<26){
                chars[i]=(char)('A'+i);
            }else {
                chars[i]=(char)('a'+i-26);
            }
        }
        for(int i=0;i<chars.length;i++){
            System.out.println(chars[i]);
        }
        System.out.println("----------------");
        Random random=new Random();
        char[] charss=new char[4];
        for(int i=0;i<charss.length;i++){
            int index=random.nextInt(52);  //0-51
            charss[i]=chars[index];
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(charss[i]);
        }
        int number=random.nextInt(10);  //0-9
        System.out.println(number);
    }
}
