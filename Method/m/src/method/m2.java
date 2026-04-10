package method;

public class m2 {
    public static void main(String[] args) {
        int []a={3,5,1,2,4};
        int[] b=sort(a);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        System.out.println("----------------");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("----------------");
        int max=max(a);
        System.out.println("最大值为"+max);
    }
    public static int[] sort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
    public static int max(int a[]){
        int max=a[0];
        for (int i = 0; i < a.length; i++) {
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
}
