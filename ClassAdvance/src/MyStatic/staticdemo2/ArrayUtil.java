package MyStatic.staticdemo2;
//工具类
public class ArrayUtil {
    //私有构造方法
    private ArrayUtil(){}
    //静态方法
    public static String printArray(int[] arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]+",");
            }
        }
        sb.append("]");
                return sb.toString();
    }
    public  static double getAverage(double []arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }
}
