package Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class p4 {
    public static void main(String[] args) throws ParseException {
        //jdk 7
        String birth="2006年6月10日";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        Date d = sdf.parse(birth);
        long birthtime=d.getTime();
        long todayTime=System.currentTimeMillis();
        //计算相差多少天
        System.out.println((todayTime-birthtime)/1000/60/60/24);

        //jdk8
        LocalDate l1=LocalDate.of(2006,6,10);
        LocalDate l2=LocalDate.now();
        long days= ChronoUnit.DAYS.between(l1,l2);
        System.out.println(days);

    }
}
