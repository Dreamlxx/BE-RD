package DuoXianCheng_day1.DuoXianCheng_day1_03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class thread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        可以获取到多线程的运行结果
         */

        MyCallable mc=new MyCallable();//表示多线程要执行的任务
        FutureTask<Integer>ft=new FutureTask<>(mc);//作用是管理多线程的结果
        Thread t1=new Thread(ft);
        t1.start();


        Integer i = ft.get();
        System.out.println(i);
    }
}
