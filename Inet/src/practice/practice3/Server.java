package practice.practice3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss =new ServerSocket(10086);
        Socket socket = ss.accept();
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/practice/practice3/server.jpg"));
        String name = UUID.randomUUID().toString().replace("-", "");  // 生成一个随机的文件名
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/practice/practice3/"+name+".jpg"));

        byte[] bytes = new byte[1024];
        int len;
        while((len=bis.read(bytes))!= -1){
            bos.write(bytes,0,len);
        }
        bos.flush();
        bos.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("上传成功");
        bw.newLine();
        bw.flush();

        socket.close();
    }
}
