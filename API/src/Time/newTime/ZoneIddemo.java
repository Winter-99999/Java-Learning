package Time.newTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;

public class ZoneIddemo {
    public static void main(String[] args) {
        // 1. 获取系统默认时区
        ZoneId defaultZone = ZoneId.systemDefault();
        System.out.println("系统默认时区: " + defaultZone);

        // 2. 创建指定时区
        ZoneId shanghaiZone = ZoneId.of("Asia/Shanghai");
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        ZoneId newYorkZone = ZoneId.of("America/New_York");

        // 3. 获取当前时间并转换时区
        ZonedDateTime shanghaiTime = ZonedDateTime.now(shanghaiZone);
        ZonedDateTime tokyoTime = shanghaiTime.withZoneSameInstant(tokyoZone);
        ZonedDateTime newYorkTime = shanghaiTime.withZoneSameInstant(newYorkZone);
        
        System.out.println("\n=== 不同时区的当前时间 ===");
        System.out.println("上海时间: " + shanghaiTime);
        System.out.println("东京时间: " + tokyoTime);
        System.out.println("纽约时间: " + newYorkTime);

        // 4. 修改时间（增加/减少时间）
        ZonedDateTime modifiedTime = shanghaiTime
                .plusHours(2)
                .plusMinutes(30)
                .minusDays(1);
        System.out.println("\n=== 修改时间 ===");
        System.out.println("原时间: " + shanghaiTime);
        System.out.println("加2小时30分，减1天: " + modifiedTime);

        // 5. 设置具体时间
        ZonedDateTime fixedTime = shanghaiTime
                .withHour(9)
                .withMinute(0)
                .withSecond(0)
                .withNano(0);
        System.out.println("\n=== 设置具体时间 ===");
        System.out.println("设置为当天9点: " + fixedTime);

        // 6. 使用 LocalDateTime 创建指定时间并转换时区
        LocalDateTime localDateTime = LocalDateTime.of(2026, 4, 28, 14, 30, 0);
        ZonedDateTime shanghaiZoned = localDateTime.atZone(shanghaiZone);
        ZonedDateTime tokyoZoned = shanghaiZoned.withZoneSameInstant(tokyoZone);
        
        System.out.println("\n=== 创建指定时间并转换 ===");
        System.out.println("上海时间: " + shanghaiZoned);
        System.out.println("对应东京时间: " + tokyoZoned);
    }
}
