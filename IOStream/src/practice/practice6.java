package practice;

import java.io.*;

public class practice6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file\\pr1\\p6.txt"));
        String line=br.readLine();
        br.close();
        int count=Integer.parseInt(line);
        count++;
        if(count<=3){
            System.out.println("第"+count+"次使用本软件免费");
        }else{
            System.out.println("免费使用次数到达三次，如需继续使用请开通会员");
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("file\\pr1\\p6.txt"));
        bw.write(count+"");
        bw.close();
    }
}
