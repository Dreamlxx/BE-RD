package DuoXianCheng_day1.XianChengChi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        //1.获取线程池对象
        ExecutorService pool1 = Executors.newCachedThreadPool();//无上限
        ExecutorService pool2 = Executors.newFixedThreadPool(3);

        //2.添加任务
        pool2.submit(new myRunable());
        pool2.submit(new myRunable());
        pool2.submit(new myRunable());
        pool2.submit(new myRunable());
        pool2.submit(new myRunable());
        pool2.submit(new myRunable());

        //3.销毁
        /*pool1.shutdown()*/;//但其实线程池一般是不会销毁的
    }
}
