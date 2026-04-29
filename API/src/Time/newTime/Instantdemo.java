package Time.newTime;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Instantdemo {
    public static void main(String[] args) {
        //获取当前标准时间
        Instant now= Instant.now();
        System.out.println(now);

        //根据秒/毫秒/纳秒 获取对象
        Instant instant1=Instant.ofEpochSecond(1);  //秒
        System.out.println(instant1);     //1970-01-01T00:00:01Z
        Instant instant2=Instant.ofEpochMilli(10000);  //毫秒
        System.out.println(instant2);     //1970-01-01T00:00:10Z
        Instant instant3=Instant.ofEpochSecond(1,1000000000);  //第一个参数是秒，第二个参数是纳秒
        System.out.println(instant3);     //结果为两个参数相加后的时间  1970-01-01T00:00:02Z
        //指定时区
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Pacific/Kwajalein"));
        System.out.println(zonedDateTime);
        //判断时间先后
        Instant instant4=Instant.ofEpochSecond(1L);
        Instant instant5=Instant.ofEpochSecond(10L);
        boolean result1=instant4.isAfter(instant5);
        System.out.println(result1);  //false
        boolean result2=instant4.isBefore(instant5);
        System.out.println(result2);  //true
        //减少时间
        Instant instant6=Instant.ofEpochMilli(5000L);
        System.out.println(instant6);   //1970-01-01T00:00:05Z
        Instant instant7 = instant6.minusSeconds(3);   //减小三秒
        System.out.println(instant7);   //1970-01-01T00:00:02Z
        //增加时间
        Instant instant8=Instant.ofEpochMilli(5000L);
        System.out.println(instant8);   //1970-01-01T00:00:05Z
        Instant instant9 = instant8.plusSeconds(3);   //增加三秒
        System.out.println(instant9);   //1970-01-01T00:00:08Z

    }
}
