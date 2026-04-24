package Test;
//将一维数组打乱顺序添加到二维数组中
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        int [][]a=new int[3][3];
        Random random=new Random();
        int[] array={1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < array.length; i++) {
            int n=random.nextInt(9);
            int temp=array[i];
            array[i]=array[n];
            array[n]=temp;
        }
        for (int i = 0; i < array.length; i++) {
            a[i/3][i%3]=array[i];
        }
        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
