package goods;

public class GoodsTest {
    public static void main(String[] args) {
        Goods g1=new Goods("001","电脑",1000,10);
        Goods g2=new Goods("002","鼠标",10,100);
        Goods g3=new Goods("003","游艇",10000,1);
        Goods arr[]={g1,g2,g3};
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i].getId()+"\t"+arr[i].getName()+"\t"+arr[i].getPrice()+"\t"+arr[i].getCount()+"\n");
        }
    }
}
