package Sort;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 2, 6, 9, 3, 4, 8};
        insertSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void insertSort(int[] arr) {
        int startIndex = -1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }
}
