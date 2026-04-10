package method;
import java.util.Random;

public class m8 {
    public static void main(String[] args) {
        int arr[]={2,588,888,1000,10000};
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int number=r.nextInt(arr.length);
            int t=arr[i];
            arr[i]=arr[number];
            arr[number]=t;
        }
        for (int j : arr) {
            System.out.println(j);
        }

    }

}
