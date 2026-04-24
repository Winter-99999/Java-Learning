package Test;
import java.util.Random;
public class Test2 {
    public static void main(String[] args) {
        int [][]a=new int[3][3];
        int []arr={1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            int n=new Random().nextInt(9);
            int temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=arr[i*3+j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
