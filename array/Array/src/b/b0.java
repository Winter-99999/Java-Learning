package b;

public class b0 {
    public static void main(String[] args) {

        int []array1={1,2,3};
        int []array2=new int[]{1,2,3};

        System.out.println(array1);    //[I@23fc625e   I表示int，@是分隔符，23fc625e是地址
       // System.out.println(array2.length);    3
        for (int i = 0; i < array1.length; i++) {   //array1.fori
            System.out.println(array1[i]);
        }
        for (int i : array1) {   //array1.for
            System.out.println(i);
        }
    }
}
