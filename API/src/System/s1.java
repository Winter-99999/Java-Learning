package System;

public class s1 {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7,8,9,10};
        int []b=new int[10];
        //如果都是基本数据类型，那么两个数组类型必须一致
        //拷贝数组  数据源数组，起始索引 目标数组，起始索引 拷贝长度
        System.arraycopy(a,0,b,0,10);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        int []c=new int[10];
        System.arraycopy(a,1,c,0,5);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
