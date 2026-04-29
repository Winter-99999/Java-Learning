package Integer;



public class demo1 {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(123);
        Integer i2 = Integer.valueOf("123");
        Integer i3 = Integer.valueOf("123", 4);  //4进制    123->27
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        //-128 到 127  已经创建好
        Integer i4 = Integer.valueOf(127);
        Integer i5 = Integer.valueOf(127);
        System.out.println(i4 == i5);  //true
        Integer i6 = Integer.valueOf(128);
        Integer i7 = Integer.valueOf(128);
        System.out.println(i6 == i7);  //false

    }
}
