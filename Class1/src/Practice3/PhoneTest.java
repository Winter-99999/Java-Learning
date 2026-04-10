package Practice3;
import java.util.Scanner;
public class PhoneTest {
    public static void main(String[] args) {
        Phone arr[]=new Phone[3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Phone();
            System.out.println("请输入手机品牌");
            String brand=sc.next();
            arr[i].setBrand(brand);
            System.out.println("请输入手机价格");
            int price=sc.nextInt();
            arr[i].setPrice(price);
            System.out.println("请输入手机颜色");
            String color=sc.next();
            arr[i].setColor(color);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getBrand()+"\t"+arr[i].getPrice()+"\t"+arr[i].getColor());
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i].getPrice();
        }
        double avg=sum*1.0/arr.length;
        System.out.println("平均价格是"+avg);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getPrice()>avg){
                System.out.println(arr[i].getBrand()+"\t"+arr[i].getPrice()+"\t"+arr[i].getColor());
            }
        }
    }
}
