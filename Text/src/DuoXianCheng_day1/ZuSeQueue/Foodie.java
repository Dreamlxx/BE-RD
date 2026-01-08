package DuoXianCheng_day1.ZuSeQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie  extends Thread{
    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int i=0;

        while(true){
            try {
                queue.take();
                System.out.println("吃鬼拿了一碗面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
