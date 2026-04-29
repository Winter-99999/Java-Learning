package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class bd1 {
    public static void main(String[] args) {
        BigDecimal b1=BigDecimal.valueOf(10.0);
        BigDecimal b2=BigDecimal.valueOf(2.0);
        // 加法
        BigDecimal b3=b1.add(b2);
        System.out.println(b3);
        // 减法
        BigDecimal b4=b1.subtract(b2);
        System.out.println(b4);
        // 乘法
        BigDecimal b5=b1.multiply(b2);
        System.out.println(b5);
        // 除法
        BigDecimal b6=b1.divide(b2);
        System.out.println(b6);

        BigDecimal b=BigDecimal.valueOf(3.0);
        // 执行除法运算，保留2位小数，使用四舍五入模式（HALF_UP）
        BigDecimal b7=b1.divide(b,2, RoundingMode.HALF_UP);
        System.out.println(b7);
        //商和余数
        BigDecimal[] a = b1.divideAndRemainder(b2);
        System.out.println(a.length);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }
}
