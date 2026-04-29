package Sort;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 6, 5, 7, 2, 9};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    // 普通版本
    // 时间复杂度：O(n^2)

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // 优化版本，添加 swapped 标志，如果某次内层循环没有发生交换，则说明数组已经有序，提前退出
    // 时间复杂度：O(n^2)
    public static void bubbleSort2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

}
