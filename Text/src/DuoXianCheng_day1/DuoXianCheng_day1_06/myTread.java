package DuoXianCheng_day1.DuoXianCheng_day1_06;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class myTread extends Thread{
    //这个类的所有对象都共享这个ticket数据.
    static int ticket=0;

    static Lock lock=new ReentrantLock();

    static Object x=new Object();//锁一定要是唯一的

    @Override
    public void run() {
        while(true){
            //同步代码块
            lock.lock();//       我把这个->     synchronized (myTread.class//这个一定是唯一的){}   替换成了->lock
                if(ticket==100){//                          锁加锁的嵌套完全不可以！！！！
                    lock.unlock();
                    break;
                }else{
                    ticket++;
                    System.out.println(getName()+"正在卖第"+ticket+"张票");
                }
            lock.unlock();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}



