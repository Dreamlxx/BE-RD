package DuoXianCheng_day1.DengDaiHuanXing;

public class TreadDemo {
    public static void main(String[] args) {
        Cook c=new Cook();
        foodie f=new foodie();

        c.setName("厨师");
        f.setName("吃货");

        c.start();
        f.start();
    }
}
