package Time.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice2 {
    public static void main(String[] args) throws ParseException {
        String s1 = "2023-11-11 00:01:00";
        String s2 = "2023-11-11 00:11:00";
        String start = "2023-11-11 00:00:00";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = sdf1.parse(s1);
        Date d2 = sdf1.parse(s2);
        Date d3 = sdf1.parse(start);
        long end = d3.getTime() + 10l * 60 * 1000;
        Date d4=new Date(end);
        if ((d1.getTime() > d3.getTime()) && (d1.getTime() < d4.getTime())) {
            System.out.println("抢到了");
        } else {
            System.out.println("没抢到");
        }

        if ((d2.getTime() > d3.getTime()) && (d2.getTime() < d4.getTime())) {
            System.out.println("抢到了");
        } else {
            System.out.println("没抢到");
        }


    }
}
