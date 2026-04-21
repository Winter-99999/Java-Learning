package MyStatic.staticdemo2;

public class Test {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        String str=ArrayUtil.printArray(arr);
        System.out.println(str);
        double []arr1={1,2,3,4,5,6,7,8,9,10};
        double avg=ArrayUtil.getAverage(arr1);
        System.out.println("平均值："+avg);
    }
}
