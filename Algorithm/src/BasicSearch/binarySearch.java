package BasicSearch;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 9));
    }

    // 二分查找 前提：数组有序
    public static int binarySearch(int[] a, int low, int high, int target) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == target) {
                return mid;
            } else if (a[mid] > target) {
                return binarySearch(a, low, mid - 1, target);
            } else {
                return binarySearch(a, mid + 1, high, target);
            }
        }
        return -1;
    }
}
