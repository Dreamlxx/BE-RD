package DuoXianCheng_day1.DuoXianCheng_day1_04;

/*
设置线程的优先级
 */

public class myThread {
    public static void main(String[] args) {
    MyRun myRun=new MyRun();

    Thread t1=new Thread(myRun,"范毅飞");
    Thread t2=new Thread(myRun,"朱淑欣");

        t1.setPriority(10);
        t2.setPriority(1);

        t1.start();
        t2.start();
    }
}
