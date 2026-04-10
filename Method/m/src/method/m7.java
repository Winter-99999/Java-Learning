package method;
import java.util.Random;
public class m7 {
    public static void main(String[] args) {
        int arr[]={2,588,888,1000,10000};
        int []narr=new int[arr.length];
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int number=r.nextInt(arr.length);   //0-4
            while(iscontain(narr,arr[number])){
                number=r.nextInt(arr.length);
            }
            narr[i]=arr[number];
        }
        for (int i = 0; i < narr.length; i++) {
            System.out.println(narr[i]);
        }

    }
    public static boolean iscontain(int []a,int prize){
        for(int i=0;i<a.length;i++){
            if(a[i]==prize){
                return true;
            }
        }
        return false;
    }
}
