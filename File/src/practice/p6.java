package practice;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class p6 {
    public static void main(String[] args) {
        File f = new File("E:\\idea\\projects\\code\\File");
        HashMap<String, Integer> hm = getCount(f);
        System.out.println(hm);
    }

    //统计文件夹中各种类型文件的个数
    public static HashMap<String, Integer> getCount(File f) {
        File[] files = f.listFiles();
        HashMap<String, Integer> map = new HashMap<>();
        for (File file : files) {
            if (file.isFile()) {
                String[] arr = file.getName().split("\\.");
                if (arr.length >= 2) {
                    String key = arr[arr.length - 1];
                    if (map.containsKey(key)) {
                        int value = map.get(key);
                        map.put(key, value + 1);
                    } else {
                        map.put(key, 1);
                    }
                }
            } else {
                HashMap<String, Integer> map1 = getCount(file);
                Set<Map.Entry<String, Integer>> entries = map1.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    int value = entry.getValue();
                    if (map.containsKey(key)) {
                        map.put(key, map.get(key) + value);
                    } else {
                        map.put(key, value);
                    }
                }
            }
        }
        return map;
    }
}
