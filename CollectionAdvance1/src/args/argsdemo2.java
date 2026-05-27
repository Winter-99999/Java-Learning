package args;

public class argsdemo2 {
    public static void main(String[] args) {
        //一个方法中最多只能有一个可变参数
        //如果方法中还有其他参数，则可变参数必须放在最后
        show(1,2,3,4,5,6,7,8,9,10);
    }
    public static void show(int a,int ...args){
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
        System.out.println(a);
    }
}
