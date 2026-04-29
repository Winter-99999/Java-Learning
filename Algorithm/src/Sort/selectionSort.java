package Sort;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 6, 5, 7, 2, 9};
        selectionSort.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    // 选择排序 每次循环把未排序的数据中最小的放到最前面
    // 时间复杂度 O(n^2)
    //标准写法
    public static void sort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void sort2(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
