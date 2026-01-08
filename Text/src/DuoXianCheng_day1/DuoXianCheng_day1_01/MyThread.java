package DuoXianCheng_day1.DuoXianCheng_day1_01;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"HelloWorld");
        }
    }
}
