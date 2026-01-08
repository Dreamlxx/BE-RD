package DuoXianCheng_day1.DuoXianCheng_day1_05;

public class MTd1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"==="+i);
        }
    }
}
