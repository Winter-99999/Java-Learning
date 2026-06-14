package bytestream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class bs1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "ii哇呜呜";  //默认是当前编码方式，此时为utf-8
        //public byte[] getBytes()  默认编码方式
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));

        //public byte[] getBytes(String charsetName) 指定编码方式
        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));

        //String (byte[])  默认编码方式
        String str2 = new String(bytes1);
        System.out.println(str2);

        //String (byte[],String charsetName) 指定编码方式
        String str3 = new String(bytes2, "GBK");
        System.out.println(str3);
    }
}
