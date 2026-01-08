package DuoXianCheng_day1.DengDaiHuanXing;

public class Cook extends Thread {
    @Override
    public void run() {
        while(true){
            synchronized (desk.lock){
                if(desk.count==0){break;}
                else {
                if(desk.foodflag==1){
                    try {
                        desk.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    System.out.println("厨师做了一碗面条");
                    desk.foodflag=1;
                    desk.lock.notifyAll();
                }
                }
            }
        }
    }
}
