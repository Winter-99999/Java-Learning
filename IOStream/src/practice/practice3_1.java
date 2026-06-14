package practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class practice3_1 {
    public static void main(String[] args) throws IOException {
        //2-1-6-4-3 -> 1-2-3-4-6
        //先读取文件，将内容保存到一个字符串中，再将字符串中的数字转换为整型进行排序，最后写入文件
        FileReader fis = new FileReader("file\\pr1\\p3.txt");
        StringBuilder sb = new StringBuilder();
        int b;
        while ((b = fis.read()) != -1) {
            sb.append((char) b);
        }
        fis.close();

        String str = sb.toString();
        String[] strs = str.split("-");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            list.add(Integer.parseInt(strs[i]));
        }
        list.sort((o1, o2) -> o1 - o2);
        FileWriter fos = new FileWriter("file\\pr1\\p3.txt");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                fos.write(list.get(i) + "");
            } else {
                fos.write(list.get(i) + "-");
            }
        }
        fos.close();
    }
}
