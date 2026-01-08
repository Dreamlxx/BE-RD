package DuoXianCheng_day1.DuoXianCheng_day1_06;

/*
StringBuilder比StringBuffer少了syn...那个锁
 */


public class TreadDemo {
    public static void main(String[] args) {
        myTread x1=new myTread();
        myTread x2=new myTread();
        myTread x3=new myTread();

        x1.setName("李响");
        x2.setName("神");
        x3.setName("王里");

        x1.start();
        x2.start();
        x3.start();
    }
}
