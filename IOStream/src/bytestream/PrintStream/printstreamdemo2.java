package bytestream.PrintStream;

import java.io.PrintStream;

public class printstreamdemo2 {
    public static void main(String[] args) {
        PrintStream ps = System.out;
        //默认指向控制台 不用自己手动关闭
        ps.println("hello world");
        ps.println(97);
        System.out.println(111);
    }
}
