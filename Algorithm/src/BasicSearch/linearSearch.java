package BasicSearch;

public class linearSearch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(linearSearch(arr, 10));
    }
    public static boolean linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
