package args;

public class argsdemo1 {
    public static void main(String []args){
        //可变参数 方法形参个数不确定时可用
        //可变参数名字不唯一   数据类型...参数名称
        int sum = getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(sum);
    }
    //可变参数实际上是个数组
    public static int getSum(int ...args){
        int sum=0;
        for (int i = 0; i < args.length; i++) {
            sum+=args[i];
        }
        return sum;
    }
}
