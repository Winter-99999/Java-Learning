package Regex;

public class demo7 {
    public static void main(String[] args) {
        String s="恐龙dbhdbf奥特曼duhswdad面包";
        String result = s.replaceAll("[\\w]+", "vs");   //替换
        System.out.println(result);

        String[] result1 = s.split("[\\w]+");   //切割
        for (int i = 0; i < result1.length; i++) {
            System.out.println(result1[i]);
        }

    }
}
