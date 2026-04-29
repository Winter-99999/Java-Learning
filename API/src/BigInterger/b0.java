package BigInterger;

import java.math.BigInteger;
import java.util.Random;

public class b0 {
    public static void main(String[] args) {
        //对象一旦创建，内部数据不能改变
        //获取一个随机整数
        Random r=new Random();
        for (int i = 0; i < 5; i++) {
            // 生成一个指定比特长度的随机BigInteger（范围：0到2^4-1）
            BigInteger b=new BigInteger(4,r);
            System.out.println(b);
        }

        //获取一个指定整数
        //字符串中必须是整数
        BigInteger b2=new BigInteger("1234567890123456789012345678901234567890");
        System.out.println(b2);
        //获取指定进制的整数
        //字符串中必须是整数,且数字与进制对应
        BigInteger b3=new BigInteger("111",2);      //2进制  7
        System.out.println(b3);
        //静态方法获取整数，参数是long类型
        //-16 - 16 之间共用一个地址
        BigInteger b4=BigInteger.valueOf(16);
        BigInteger b5=BigInteger.valueOf(16);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b4==b5);  // true
    }
}
