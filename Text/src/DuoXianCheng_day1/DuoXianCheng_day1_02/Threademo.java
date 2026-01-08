package DuoXianCheng_day1.DuoXianCheng_day1_02;

public class Threademo {
    public static void main(String[] args) {
        MyRun myRun=new MyRun();


        Thread thread1=new Thread(myRun);
        Thread thread2=new Thread(myRun);


        thread2.setName("2");
        thread1.setName("1");


        thread1.start();
        thread2.start();
    }
}
