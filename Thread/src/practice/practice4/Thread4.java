package practice.practice4;

import java.util.Random;

public class Thread4 extends Thread {
    // 全局共享资源：总金额、剩余名额、红包数组
    static int sum = 100;
    static int count = 3;
    private static final int MIN = 1;
    private static Random random = new Random();
    // 全局统一存放3个红包金额
    static int[] redPackets = new int[3];

    // 静态代码块：类加载时一次性拆分100元为3份红包（全局唯一）
    static {
        int num1 = random.nextInt(sum - (count - 1) * MIN) + MIN;
        int num2 = random.nextInt(sum - num1 - (count - 2) * MIN) + MIN;
        int num3 = sum - num1 - num2;
        redPackets[0] = num1;
        redPackets[1] = num2;
        redPackets[2] = num3;
    }

    @Override
    public void run() {
        synchronized (Thread4.class) {
            if (count <= 0) {
                System.out.println(getName() + "没有抢到红包");
                return; // 无红包直接退出，不往下执行
            }
            // count=3 对应数组第0个红包，count=2对应第1个，count=1对应第2个
            int money = redPackets[3 - count];
            System.out.println(getName() + "抢到了" + money + "元");
            count--;
        }
    }
}