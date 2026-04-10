package method;

public class m3 {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7,8,9};
        int []b=subArray(a,2,5);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
    public static int[] subArray(int []a,int from,int to){
        int []b=new int[to-from+1];
        for(int i=from-1;i<to;i++){
            b[i-from+1]=a[i];
        }
        return b;
    }
}
