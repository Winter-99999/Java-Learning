package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo6 {
    public static void main(String[] args) {
        String content = "JaVa0 Java1 Java2 Java3 Java4  Python1 Java5 Java6 Java7 Java8 Java9 Java10";
        //有条件的爬取
        String regex = "(?i)Java(?=0|1|2)";    //JaVa0 Java1 Java2  Java10匹配
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(content);
        while (m.find()) {
            System.out.println(m.group());  //输出四个
        }
        System.out.println("---------");
        String regex1 = "(?i)Java(?!0|1|2)";
        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(content);
        while (m1.find()) {
            System.out.println(m1.group());  //输出六个
        }
    }
}
