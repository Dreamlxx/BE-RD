package PokerGame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;


public class Poker {
    //创建一个牌盒
    static ArrayList<String>x1=new ArrayList();//必须加static，因为在下面的静态代码块中用到了。

    static HashMap<String,Integer> hm=new HashMap<>();

    //静态代码块
    //跟随着类创建而创建，而且只加载一次
    static {
    //创建扑克牌
        String[] arr1={ "♣","♦","♥","♠"};
        String[]arr2={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        for (String a:arr1) {
            for (String b:arr2) {
                x1.add(a+b);
            }
        }
        x1.add(" 大王");
        x1.add(" 小王");


        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("A",14);
        hm.put("2",15);
        hm.put("小王",20);
        hm.put("大王",50);
    }


    Poker(){
        System.out.println(x1);
        //洗牌
        Collections.shuffle(x1);
        System.out.println(x1);
        //发牌
        ArrayList<String> lord=new ArrayList<>();
        ArrayList<String> p1=new ArrayList<>();
        ArrayList<String> p2=new ArrayList<>();
        ArrayList<String> p3=new ArrayList<>();
        for (int i = 0; i < x1.size(); i++) {
            if(i<3){
                lord.add(x1.get(i));
            } else  {
                if(i%3==0){
                    p1.add(x1.get(i));
                }
                if(i%3==1){
                    p2.add(x1.get(i));
                }
                if(i%3==2){
                    p3.add(x1.get(i));
                }
            }
        }
        //对牌进行排序
        order(p1);
        order(p2);
        order(p3);
        //看牌

        lookCard(p1,"李响");
        lookCard(p2,"付常青");
        lookCard(p3,"刘俊羿");
    }

    public void lookCard(ArrayList<String> card,String name){
        System.out.println(name+":"+card);
    }

    //将每个人的牌进行一个排序
    public void order(ArrayList<String> list){
        Collections.sort(list, new Comparator<String>() {
            //Array.sort(插入排序+二分查找)
            @Override
            public int compare(String o1, String o2) {
                //o1表示当前要插入到有序序列中的牌
                //o2表示已经在有序序列中存在的牌
                /*
                正数：o1大插入到后面
                负数：o1小插入到前面
                0表示o1的数字跟o2的数字是一样的
                 */

                //计算o1的花色和价值
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);

                //计算o2的花色
                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);


                //比较o1和o2的值并返回
                int i=value1-value2;
                return i==0?color1.compareTo(color2):i;
            }
        });
    }

//获取数
    public int getValue(String poker){
        String number=poker.substring(1);
        if(hm.containsKey(number)){
            return hm.get(number);
        }else{
            return Integer.parseInt(number);//在hashmap中存在的key和value调用，没有的直接将当前传入的字符类型的数强制转化为int返回
        }
    }

    public static void main(String[] args){
        Poker lx=new Poker();
    }
}
