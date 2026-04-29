package Time.newTime;

import java.time.LocalDateTime;

public class LocalDateTimedemo {
    public static void main(String[] args) {
        //当前时间的日历对象
        LocalDateTime l=LocalDateTime.now();
        System.out.println("今天是"+l);
        System.out.println(l.getYear());
        System.out.println(l.getMonthValue());
        System.out.println(l.getDayOfMonth());
        System.out.println(l.getHour());
        System.out.println(l.getMinute());
        System.out.println(l.getSecond());
        //当年的第几天
        System.out.println(l.getDayOfYear());  //118
        //星期
        System.out.println(l.getDayOfWeek());   //TUESDAY
        System.out.println(l.getDayOfWeek().getValue());  //2
        //月份
        System.out.println(l.getMonth());   //APRIL
        System.out.println(l.getMonth().getValue());  //4

    }
}
