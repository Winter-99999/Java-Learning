package practice;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class practice5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file\\pr1\\p5\\p5.txt"));
        TreeMap<Integer, String> tmap = new TreeMap<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] strs = line.split("\\.");
            if (strs.length > 0 && !strs[0].isEmpty()) {
                int num = Integer.parseInt(strs[0]);
                tmap.put(num, line);
            }
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("file\\pr1\\p5\\p5_1.txt"));
        Set<Map.Entry<Integer, String>> entries = tmap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            bw.write(entry.getValue());
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
