package Runtime;

import java.io.IOException;

public class r0 {
    public static void main(String[] args) throws IOException {
        //获取运行时对象
        Runtime r=Runtime.getRuntime();
        //获取运行时对象属性
        System.out.println("可用处理器数量:"+r.availableProcessors());
        System.out.println("空闲内存:"+r.freeMemory());
        System.out.println("总内存:"+r.totalMemory());
        System.out.println("最大内存:"+r.maxMemory());

        //r.exit(0);
        //运行cmd 命令
        //r.exec("notepad");
        //定时关机
        //-s 关机  -r 重启  -t 秒数  -a 取消
        r.exec("shutdown -s -t 3600");  //3600秒后关机
        r.exec("shutdown -a");
    }
}
