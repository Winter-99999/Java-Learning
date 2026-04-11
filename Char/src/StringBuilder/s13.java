package StringBuilder;

public class s13 {
    public static void main(String[] args) {
        int []arr={1,3,5};
        System.out.println(arrToString(arr));
    }
    public static String arrToString(int []arr){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]).append("]");
            }else{
                sb.append(arr[i]).append(",");
            }
        }
        return "["+sb.toString();
    }
}
