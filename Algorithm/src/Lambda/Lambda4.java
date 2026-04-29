package Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda4 {
    public static void main(String[] args) {
        String[] arr={"aa","a","aaa","aaaa"};
        //匿名内部类
/*        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
*/
        //Lambda
        Arrays.sort(arr, (o1,  o2)-> o1.length()-o2.length());
        System.out.println(Arrays.toString(arr)); // [a, aa, aaa, aaaa]
    }
}
