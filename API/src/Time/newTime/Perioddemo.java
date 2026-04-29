package Time.newTime;

import java.time.LocalDate;
import java.time.Period;

public class Perioddemo {
    public static void main(String[] args) {
        LocalDate nowtime = LocalDate.now();  //只有年月日
        System.out.println(nowtime);
        LocalDate birth = LocalDate.of(1999, 10, 10);

        Period p = Period.between(birth, nowtime);   //第二个参数减第一个参数

        System.out.println(p);
        System.out.println("年份：" + p.getYears());
        System.out.println("月份：" + p.getMonths());
        System.out.println("天数：" + p.getDays());

        System.out.println("总月份数：" + p.toTotalMonths());  //相差的总月份数

    }
}
