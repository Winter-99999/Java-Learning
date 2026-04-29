package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice1 {
    public static void main(String[] args) {
        String content="JaVa0 Java1 Java2 Java3 Java4 abbbbbbaaaa";
        //贪婪爬取  尽可能多的爬取数据
        //ab+   abbbbbbaaaa->abbbbbb
        //默认是贪婪爬取
        String regex="ab+";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(content);
        while (m.find()){
            System.out.println(m.group());   //abbbbbb
        }
        //非贪婪爬取
        String regex1="ab+?";
        Pattern p1=Pattern.compile(regex1);
        Matcher m1=p1.matcher(content);
        while (m1.find()){
            System.out.println(m1.group());  //ab
        }
    }
}
