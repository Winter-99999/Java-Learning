package Time.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice1 {
    public static void main(String[] args) throws ParseException {
        String s="2000-11-11";
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf1.parse(s);
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日");
        String s1 = sdf2.format(d);
        System.out.println(s1);
    }
}
