package Time.Date;

import java.util.Date;

public class demo1 {
    public static void main(String[] args) {
        //表示当前时间
        Date d1=new Date();
        System.out.println(d1);
        //表示指定时间
        Date d2=new Date(0l);
        System.out.println(d2);
        //修改时间
        d2.setTime(1000l);   //单位 毫秒
        System.out.println(d2);
        //获取当前毫秒值
        long time=d2.getTime();
        System.out.println(time);
    }
}
