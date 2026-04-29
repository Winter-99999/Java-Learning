package Practice;

public class p3 {
    public static void main(String[] args) {
        //每次吃一半然后多吃一个，第十天的时候就剩一个
        //递归 计算第一天一共几个
        System.out.println(getCount(1));
    }
    public static int getCount(int day) {
        if(day==10){
            return 1;
        }else{
            return ((getCount(day+1)+1)*2);
        }
    }

}
