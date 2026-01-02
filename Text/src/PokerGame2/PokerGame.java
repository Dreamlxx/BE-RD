package PokerGame2;

//利用hashmap和treemap使玩家手中的牌是有序的。

import java.util.ArrayList;
import java.util.HashMap;

public class PokerGame {
    //创建牌盒
    static HashMap<Integer,String> hm=new HashMap<>();
    static ArrayList<Integer>list=new ArrayList<>();

    static {
        int key=1;
        String[] arr1={ "♣","♦","♥","♠"};
        String[]arr2={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for (String number : arr2) {
            for (String color : arr1) {
                hm.put(key,color+number);
                list.add(key);
                key++;
            }
        }
        hm.put(key,"大王");
        list.add(key);
        key++;
        hm.put(key,"小王");
        list.add(key);
    }

    PokerGame(){
        System.out.println(list);
        System.out.println(hm);
        //洗牌

        //发牌

        //看牌
    }
}
