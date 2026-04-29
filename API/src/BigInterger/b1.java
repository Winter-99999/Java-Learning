package BigInterger;

import java.math.BigInteger;

public class b1 {
    public static void main(String[] args) {
        BigInteger b1=new BigInteger("4");
        BigInteger b2=new BigInteger("2");
        // 加法
        BigInteger b3=b1.add(b2);
        System.out.println(b3);
        // 减法
        BigInteger b4=b1.subtract(b2);
        System.out.println(b4);
        // 乘法
        BigInteger b5=b1.multiply(b2);
        System.out.println(b5);
        // 除法
        BigInteger b6=b1.divide(b2);
        System.out.println(b6);
        //商和余数
        BigInteger[] a = b1.divideAndRemainder(b2);
        System.out.println(a.length);
        System.out.println(a[0]);
        System.out.println(a[1]);
        //比较数值是否相同
        boolean b7=b1.equals(b2);
        System.out.println(b7);  // false



    }
}
