package Time.Date;

import java.util.Date;
import java.util.Random;

public class demo2 {
    public static void main(String[] args) {
        Random r = new Random();

        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));
        System.out.println(d1);
        System.out.println(d2);
        if (d1.getTime() > d2.getTime()) {
            System.out.println("d1时间比d2时间晚");
        } else if (d1.getTime() < d2.getTime()) {
            System.out.println("d1时间比d2时间早");
        } else {
            System.out.println("d1时间比d2时间相同");
        }

    }
}
