package properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesdemo2 {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.put("name","zhang");
        p.put("age","18");
        p.put("sex","nan");
        FileOutputStream fos = new FileOutputStream("src\\properties\\pro.txt");
        p.store(fos,"user info");
        fos.close();
    }
}
