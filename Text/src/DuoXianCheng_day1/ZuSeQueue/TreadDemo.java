package DuoXianCheng_day1.ZuSeQueue;

/*
使用阻塞队列的等待唤醒
 */


import java.util.concurrent.ArrayBlockingQueue;

public class TreadDemo {


    public static void main(String[] args) {
        ArrayBlockingQueue <String> queue=new ArrayBlockingQueue<>(1);

        Cook c =new Cook(queue);
        Foodie f=new Foodie(queue);

        c.start();
        f.start();
    }
}
