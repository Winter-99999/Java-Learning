package BigDecimal;

import java.math.BigDecimal;

public class bd0 {
    public static void main(String[] args) {
        // 通过double创建BigDecimal对象，结果是不精确的
        BigDecimal bd=new BigDecimal(1.01);
        System.out.println(bd);
        //通过字符串创建BigDecimal对象，结果是精确的
        BigDecimal bd1=new BigDecimal("1.01");
        BigDecimal bd2=new BigDecimal("1.0");
        System.out.println(bd1);
        System.out.println(bd2);
        System.out.println(bd1.add(bd2)); // 输出 2.01
        System.out.println(bd1.multiply(bd2));  // 输出 1.010

        //静态方法创建BigDecimal对象
        BigDecimal bd3=BigDecimal.valueOf(1.2);
        System.out.println(bd3);


    }
}
