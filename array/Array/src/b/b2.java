package b;
import java.util.Random;
public class b2 {
    public static void main(String[] args) {
        int a[]={1,6,5,8,20,34,7};
        int max=a[0];
        for (int j : a) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println("最大值为"+max);
        System.out.println("-----------------");
        Random r=new Random();
        int b[]=new int[10];
        for (int i = 0; i < b.length; i++) {
            b[i]=r.nextInt(100)+1;  //1-100
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println("-----------------");
        for(int i=0;i<b.length;i++){
            for(int j=i+1;j<b.length;j++){
                if(b[i]>b[j])  {
                    int temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
