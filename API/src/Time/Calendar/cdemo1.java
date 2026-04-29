package Time.Calendar;

import java.util.Calendar;
import java.util.Date;

public class cdemo1 {
    public static void main(String[] args) {
        //Calendar是一个抽象类 不能直接创建对象 需要通过getInstance函数获取子类对象
        //默认表示当前时间
        //把年，月，日，星期等等信息放在一个数组中
        //月份 0-11  实际月份为显示月份+1
        //星期 1表示星期日 2表示星期一 依次顺延
        Calendar c=Calendar.getInstance();
        Date d=new Date(0l);
        c.setTime(d);
        int year=c.get(1);
        int month=c.get(2)+1;
        int day=c.get(5);
        System.out.println(year+"年"+month+"月"+day+"日");

        //也可以用常量
        c.set(2,1);   //将月份改为2
        int year1=c.get(Calendar.YEAR);
        int month1=c.get(Calendar.MONTH)+1;
        int day1=c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year1+"年"+month1+"月"+day1+"日");

        c.add(Calendar.YEAR,2);      //amount也可以是负数，即往前推
        int year2=c.get(Calendar.YEAR);
        int month2=c.get(Calendar.MONTH)+1;
        int day2 = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year2+"年"+month2+"月"+day2+"日");
    }
}
