package Practice;

public class p2 {
    public static void main(String[] args) {
        //不死神兔
        //开始有一对兔子，在兔子第三个月时会生出一对兔子，每对兔子都生一对兔子，且兔子永远不会死
        //1 1 2 3 5 8 13 ...
        System.out.println(sum(5));
    }
    //斐波那契数列
    public static int sum(int month){
        if(month==1||month==2){
            return 1;
        }
        return sum(month-1)+sum(month-2);
    }
}
