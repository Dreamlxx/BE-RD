package DuoXianCheng_day1.DuoXianCheng_day1_05;

public class MTd2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"=="+i);
        }
    }
}
