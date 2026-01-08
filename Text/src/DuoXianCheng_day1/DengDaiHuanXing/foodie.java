package DuoXianCheng_day1.DengDaiHuanXing;

public class foodie extends Thread {
    @Override
    public void run() {
        /*
        这是消费者：
            有食物就吃、没食物就等待，并唤醒
         */
        while(true){
            synchronized (desk.lock){
                if(desk.count==0){break;}
                else{
                    //先判断桌子上是否有面条
                    if(desk.foodflag==0){
                        try {
                            desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else{
                        desk.count--;//表示还能吃多少碗
                        System.out.println("老吃家在吃面条，还能再吃"+desk.count+"碗");
                        desk.lock.notifyAll();//唤醒厨师继续做
                        desk.foodflag=0;//表示桌子上没了面条
                    }
                }
            }
        }
    }
}
