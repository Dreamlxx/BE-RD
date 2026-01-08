package DuoXianCheng_day1.DengDaiHuanXing;

public class desk {
    /*
    作用：控制生产者和消费者的执行
     */

    public static int count=10;//总个数

    public static int foodflag=0;//  0:表示没有面条、1：表示有面条

    public static Object lock=new Object();//锁
}
