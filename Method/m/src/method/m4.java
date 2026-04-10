package method;
import java.util.Scanner;
public class m4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入机票原价：");
        int price=sc.nextInt();
        System.out.println("请输入月份：");
        int month=sc.nextInt();
        System.out.println("请输入购买的舱位，0表示头等舱，1表示经济舱");
        int type=sc.nextInt();
        if((month>=5&&month<=10)){
            if(type==0){
                price=(int)(price*0.9);
            }else if(type==1){
                price=(int)(price*0.85);
            }else{
                System.out.println("请输入正确的舱位");
            }
        }else if(month>=11&&month<=12||(month>=1&&month<=4)){
            if(type==0){
                price=(int)(price*0.7);
            }else if(type==1){
                price=(int)(price*0.65);
            }else{
                System.out.println("请输入正确的舱位");
            }
        }
        System.out.println("机票价格："+price);
    }
    //ctrl+alt+m 抽取方法
    public static int getPrice(int price,int month,int type){
        if((month>=5&&month<=10)){
            if(type==0){
                price=(int)(price*0.9);
            }else if(type==1){
                price=(int)(price*0.85);
            }else{
                System.out.println("请输入正确的舱位");
            }
        }else if(month>=11&&month<=12||(month>=1&&month<=4)){
            if(type==0){
                price=(int)(price*0.7);
            }
        }
        return price;
    }
}
