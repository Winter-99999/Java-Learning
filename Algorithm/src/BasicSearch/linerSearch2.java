package BasicSearch;

import java.util.ArrayList;

public class linerSearch2 {
    public static void main(String[] args) {
        int []arr={10,2,3,4,5,6,7,8,9,10};
        System.out.println(linerSearch2(arr, 10));
        for (int i = 0; i < linerSearch2(arr, 10).size(); i++) {
            System.out.println(linerSearch2(arr, 10).get(i));
        }
    }
    //考虑重复的数据
    public static ArrayList<Integer> linerSearch2(int[] arr, int target){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                list.add(i);
            }
        }
        return list;
    }
}
