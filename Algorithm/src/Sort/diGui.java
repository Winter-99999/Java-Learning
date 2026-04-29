package Sort;

public class diGui {
    public static void main(String[] args) {
        int sum1=sum(5);
        System.out.println(sum1);
        int factorial1=factorial(5);
        System.out.println(factorial1);
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return  sum(n-1)+n;
    }
    public  static int factorial(int n){
        if(n==1){
            return 1;
        }
        return factorial(n-1)*n;
    }
}
