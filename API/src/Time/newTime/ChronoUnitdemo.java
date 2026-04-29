package Time.newTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class ChronoUnitdemo {
    public static void main(String[] args) {
        // 1. 计算两个日期之间的时间差
        LocalDate date1 = LocalDate.of(2020, 1, 1);
        LocalDate date2 = LocalDate.of(2026, 4, 28);
        
        long years = ChronoUnit.YEARS.between(date1, date2);
        long months = ChronoUnit.MONTHS.between(date1, date2);
        long days = ChronoUnit.DAYS.between(date1, date2);
        long weeks = ChronoUnit.WEEKS.between(date1, date2);
        
        System.out.println("=== 日期之间的时间差 ===");
        System.out.println("2020-01-01 到 2026-04-28:");
        System.out.println("年数: " + years);
        System.out.println("月数: " + months);
        System.out.println("天数: " + days);
        System.out.println("周数: " + weeks);
        System.out.println();

        // 2. 计算两个时间之间的时间差
        LocalDateTime dateTime1 = LocalDateTime.of(2026, 4, 28, 10, 30, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2026, 4, 28, 15, 45, 30);
        
        long hours = ChronoUnit.HOURS.between(dateTime1, dateTime2);
        long minutes = ChronoUnit.MINUTES.between(dateTime1, dateTime2);
        long seconds = ChronoUnit.SECONDS.between(dateTime1, dateTime2);
        
        System.out.println("=== 时间之间的时间差 ===");
        System.out.println("10:30:00 到 15:45:30:");
        System.out.println("小时数: " + hours);
        System.out.println("分钟数: " + minutes);
        System.out.println("秒数: " + seconds);
        System.out.println();

        // 3. 增加/减少时间
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime plus2Days = now.plus(2, ChronoUnit.DAYS);
        LocalDateTime minus3Hours = now.minus(3, ChronoUnit.HOURS);
        LocalDateTime plus1Week = now.plus(1, ChronoUnit.WEEKS);
        
        System.out.println("=== 增加/减少时间 ===");
        System.out.println("当前时间: " + now);
        System.out.println("加2天: " + plus2Days);
        System.out.println("减3小时: " + minus3Hours);
        System.out.println("加1周: " + plus1Week);
        System.out.println();

        // 4. 截断时间（舍去精度）
        LocalDateTime dateTime = LocalDateTime.of(2026, 4, 28, 14, 30, 45, 123456789);
        LocalDateTime truncatedToDays = dateTime.truncatedTo(ChronoUnit.DAYS);
        LocalDateTime truncatedToHours = dateTime.truncatedTo(ChronoUnit.HOURS);
        LocalDateTime truncatedToMinutes = dateTime.truncatedTo(ChronoUnit.MINUTES);
        
        System.out.println("=== 截断时间 ===");
        System.out.println("原始时间: " + dateTime);
        System.out.println("截断到天: " + truncatedToDays);
        System.out.println("截断到小时: " + truncatedToHours);
        System.out.println("截断到分钟: " + truncatedToMinutes);
        System.out.println();

        // 5. 判断时间单位是否受支持
        System.out.println("=== 检查时间单位支持 ===");
        System.out.println("LocalDate 支持天: " + ChronoUnit.DAYS.isSupportedBy(LocalDate.now()));
        System.out.println("LocalDate 支持小时: " + ChronoUnit.HOURS.isSupportedBy(LocalDate.now()));
        System.out.println("LocalDateTime 支持小时: " + ChronoUnit.HOURS.isSupportedBy(LocalDateTime.now()));
        System.out.println("LocalDateTime 支持秒: " + ChronoUnit.SECONDS.isSupportedBy(LocalDateTime.now()));
    }
}
