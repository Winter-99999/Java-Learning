package Class;

public class Phone {
    String brand;
   int price;

   public Phone(String brand, int price) {
      this.brand = brand;
      this.price = price;
   }
   public void call(String name){
       System.out.println("正在给"+name+"打电话");
   }
   public void show(){
       System.out.println("手机品牌是"+brand+"价格是"+price);
   }
}
