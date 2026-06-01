package demo.throw_;

public class demo10 {
    public static void main(String[] args) {
        int []arr=new int[2];
        int max=0;
        try {
            max = getMAx(arr);
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
        System.out.println(max);
    }
    public static int getMAx(int []arr) throws  NullPointerException,IllegalArgumentException{
        if(arr==null){
            throw new NullPointerException("数组不能为空");
        }
        if(arr.length==0){
            throw new IllegalArgumentException("数组不能为空");
        }
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
