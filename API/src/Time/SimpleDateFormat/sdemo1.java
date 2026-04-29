package Time.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class sdemo1 {
    public static void main(String[] args) throws ParseException {
        format();
        parse();
    }

    private static void parse() throws ParseException {
        String s="2020-10-12 12:23:38";
        //与字符串格式保持一致
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf1.parse(s);
        System.out.println(d);
    }

    private static void format() {
        Date d1=new Date(0l);
        //无参构造 默认格式
        SimpleDateFormat sdt1=new SimpleDateFormat();
        String str1 = sdt1.format(d1);
        System.out.println(str1);    //1970/1/1 08:00
        //带参构造 指定格式
        SimpleDateFormat sdt2=new SimpleDateFormat("yyyy年mm月dd日 HH:mm:ss");
        String str2 = sdt2.format(d1);
        System.out.println(str2);    //1970年00月01日 08:00:00

        SimpleDateFormat sdt3=new SimpleDateFormat("yyyy年mm月dd日 HH:mm:ss E");
        String str3 = sdt3.format(d1);
        System.out.println(str3);
    }
}
