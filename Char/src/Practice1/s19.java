package Practice1;
import java.util.Random;
//随机生成一个5位密码，必须有数字，数字在随意位置
public class s19 {
    public static void main(String[] args) {
        char []chs1={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char []chs2={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char []chs3={'0','1','2','3','4','5','6','7','8','9'};
        Random random=new Random();
        int number=random.nextInt(6);    //0-5,决定密码中数字的位置
        System.out.println(number);
        StringBuilder sb=new StringBuilder();
        //数字之前的字母
        for (int i = 1; i < number; i++) {
            int number1=random.nextInt(4);  //0-3,保证选择大小写字母的概率相同
            if(number1%2==0){
                sb.append(chs1[random.nextInt(chs1.length)]);
            }else{
                sb.append(chs2[random.nextInt(chs2.length)]);
            }
        }
        sb.append(chs3[random.nextInt(chs3.length)]);
        //数字之后的字母
        for(int i=0;i<5-number;i++){
            int number1=random.nextInt(4);
            if(number1%2==0){
                sb.append(chs1[random.nextInt(chs1.length)]);
            }else{
                sb.append(chs2[random.nextInt(chs2.length)]);
            }
        }
        System.out.println(sb.toString());
    }
}
