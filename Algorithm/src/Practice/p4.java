package Practice;

public class p4 {
    public static void main(String[] args) {
        //爬楼梯 一次爬一级或者两级
        //计算出第n级台阶有多少种方法
        int c=count(7);
        System.out.println(c);
        System.out.println(count1(20));
    }
    public static int count(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else{
            return count(n-1)+count(n-2);
        }
    }
    //爬楼梯一次爬一级或者两级或者三级
    public static int count1(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else if(n==3){
            return 4;
        }
        else{
            return count1(n-1)+count1(n-2)+count1(n-3);
        }
    }
}
