public class Arraysdemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // toString 将数组转换成字符串
        String s = java.util.Arrays.toString(arr);
        System.out.println(s); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        //binarySearch 二分查找 要求升序
        //如果数组中存在该元素，返回的是该元素的索引
        //如果数组中不存在该元素，返回的是-插入值-1
        int index = java.util.Arrays.binarySearch(arr, 5);
        System.out.println(index); // 4
        System.out.println(java.util.Arrays.binarySearch(arr, 11)); // -11
        //copyOf 拷贝数组 从0索引开始
        int[] arr2 = java.util.Arrays.copyOf(arr, 5);
        System.out.println(java.util.Arrays.toString(arr2)); // [1, 2, 3, 4, 5]
        int[]arr4= java.util.Arrays.copyOf(arr, 15);
        System.out.println(java.util.Arrays.toString(arr4)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0]
        //copyOfRange 拷贝数组  可以指定范围
        int[] arr3 = java.util.Arrays.copyOfRange(arr, 2, 5);
        System.out.println(java.util.Arrays.toString(arr3)); // [3, 4, 5]
        //fill 填充数组
        int []a=new int[10];
        java.util.Arrays.fill(a, 1, 5, 5);  //指定范围
        System.out.println(java.util.Arrays.toString(a)); // [0, 5, 5, 5, 5, 0, 0, 0, 0, 0]
        int []b=new int[10];
        java.util.Arrays.fill(b, 5);  //全部填充
        System.out.println(java.util.Arrays.toString(b)); // [5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
        //sort 排序 升序 快速排序
        java.util.Arrays.sort(arr);
        System.out.println(java.util.Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
