package System;

public class s0 {
    public static void main(String[] args) {
        //终止虚拟机运行
        //0 正常终止 非0 异常终止

        //System.exit(0);
        //System.out.println("程序已结束---");  //不会执行

        long start=System.currentTimeMillis();
        for (int i = 0; i < 300; i++) {
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        //获取运行时间   毫秒为单位
        System.out.println(end-start);
    }
}
