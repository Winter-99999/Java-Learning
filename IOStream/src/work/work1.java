package work;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class work1 {
    public static void main(String[] args) throws IOException {
        String familyname ="";
        String familyNameList = webSpider(familyname);
        ArrayList<String> familyName = getFamilyName(familyNameList, "(.{4})(，|。)", 1);

    }
    public static ArrayList<String> getFamilyName(String familyNameList,String regex,int group) {
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(familyNameList);
        while (matcher.find()) {
            String data = matcher.group();
            list.add(data);
        }
        return list;
    }
    public static String webSpider(String net) throws IOException {
        StringBuilder sb = new StringBuilder();
        URL url = new URL(net);
        //连接这个网址
        URLConnection urlConnection = url.openConnection();
        //读取数据
        InputStreamReader inputStreamReader = new InputStreamReader(urlConnection.getInputStream());
        int data;
        while ((data = inputStreamReader.read()) != -1) {
            sb.append((char) data);
        }
        inputStreamReader.close();
        return sb.toString();
    }
}
