package practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.IntFunction;

public class practice3_2 {
    public static void main(String[] args) throws IOException {
        //利用流进行转换和排序
        //文件内容不能换行 不能有bom头
        FileReader fis = new FileReader("file\\pr1\\p3.txt");
        StringBuilder sb = new StringBuilder();
        int b;
        while ((b = fis.read()) != -1) {
            sb.append((char) b);
        }
        fis.close();

        String str = sb.toString();
        String[] strs = str.split("-");
        Integer[] array = Arrays.stream(strs)
                .map(Integer::parseInt)
                .sorted()
                .toArray(value -> new Integer[value]);

        System.out.println(Arrays.toString(array));

        FileWriter fos = new FileWriter("file\\pr1\\p3.txt");
        String result = Arrays.toString(array).replace(", ", "-");
        fos.write(result.substring(1, result.length() - 1));
        fos.close();
    }
}
