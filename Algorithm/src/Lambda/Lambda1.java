package Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda1 {
    public static void main(String[] args) {
        Integer[] arr={2,6,4,1,3,9,5};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o1-o2;
            }
        });
        System.out.println(Arrays.toString(arr));

        Integer[] arr1 = Arrays.copyOf(arr, 7);
        Arrays.sort(arr1,(Integer o1, Integer o2)->{
                return o1-o2;

        });
        System.out.println(Arrays.toString(arr1));

    }
}
