package Sort;

public class quickSort {
    public static void main(String[] args){
        int []arr = {6 , 2 , 7 , 1 , 9 , 5, 8};
        quickSort(arr, 0, arr.length-1);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void quickSort(int[] arr, int left, int right){
        int start=left;
        int end=right;
        if(start>=end){
            return;
        }
        //定义基准数，默认为第一个元素
        int baseNumber=arr[left];
        //从左右两边开始向中间扫描
        while(start!=end){
            //找到右边比baseNumber小的数
            while(true){
                if(start>=end||arr[end]<baseNumber){
                    break;
                }
                end--;
            }
            //找到左边比baseNumber大的数
            while(true){
                if(start>=end||arr[start]>baseNumber){
                    break;
                }
                start++;
            }
            //交换两个数
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        //循环结束后，start和end相等，交换start和baseNumber
        int temp=arr[start];
        arr[start]=arr[ left];
        arr[left]=temp;

        quickSort(arr,left,start-1);
        quickSort(arr,start+1,right);
    }
}
