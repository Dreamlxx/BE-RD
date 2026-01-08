package DuoXianCheng_day1.DuoXianCheng_day1_04;

import java.lang.Thread;

public class MyRun implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
