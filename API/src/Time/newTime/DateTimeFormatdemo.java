package Time.newTime;


import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatdemo {
    public static void main(String[] args) {
        ZonedDateTime time= ZonedDateTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        System.out.println(dtf.format(time));
    }
}
