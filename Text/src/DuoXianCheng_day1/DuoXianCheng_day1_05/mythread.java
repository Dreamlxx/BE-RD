package DuoXianCheng_day1.DuoXianCheng_day1_05;

public class mythread {
    public static void main(String[] args) throws InterruptedException {
    MTd1 x1=new MTd1();
    MTd2 x2=new MTd2();

    x1.setName("cxy");
    x2.setName("lx");

    x2.setDaemon(true);//设置为守护线程
//当cxy结束，守护线程就不会走完，草草结束
        x1.start();
        x2.start();

        x1.join();


        for (int i = 0; i <10 ; i++) {
            System.out.println("main:"+i);
        }

    }
}
