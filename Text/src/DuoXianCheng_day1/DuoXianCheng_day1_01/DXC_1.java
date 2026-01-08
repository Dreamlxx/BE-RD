package DuoXianCheng_day1.DuoXianCheng_day1_01;

public class DXC_1 {
    public static void main(String[] args) {
        /*
        多线程的第一种启动方式：
                1.自己定义一个类继承Thread
                2.重写run方法
                3.创建子类对象，并且执行
         */

    MyThread t1=new MyThread();
    MyThread t2=new MyThread();

        t1.setName("李响");
        t2.setName("范毅飞");

    t1.start();
    t2.start();//这样才是启动新线程

    }
}
