package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo5 {
    public static void main(String[] args) {
        String content="Java0 Java1 Java2 Java3 Java4  Python1 Java5 Java6 Java7 Java8 Java9 Java10";
        //Pattern 表示正则表达式
        //Matcher 文本匹配器 用来匹配正则表达式
        Pattern p=Pattern.compile("Java\\d{0,2}");
        Matcher m=p.matcher(content);
        //m.find()  返回true 表示找到匹配的子字符串 在底层记录了子串的起始和结束索引 否则返回false
        //m.group()  返回匹配的子字符串  索引包左不包右
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
