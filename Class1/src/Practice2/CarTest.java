package Practice2;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car c1=new Car();
        Scanner sc=new Scanner(System.in);
        Car []arr=new Car[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Car();        //创建对象

            System.out.println("请输入汽车品牌");
            String brand=sc.next();
            arr[i].setBrand(brand);

            System.out.println("请输入汽车价格");
            int price=sc.nextInt();
            arr[i].setPrice(price);

            System.out.println("请输入汽车颜色");
            String color=sc.next();
            arr[i].setColor(color);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getBrand()+"\t"+arr[i].getPrice()+"\t"+arr[i].getColor());
        }
    }
}
