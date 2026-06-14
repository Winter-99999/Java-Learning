package properties;

import java.util.Properties;

public class propertiesdemo1 {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.put("name","张三");
        p.put("age","18");
        p.put("sex","男");
        System.out.println(p);
        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("age"));
        System.out.println(p.getProperty("sex"));
    }
}
