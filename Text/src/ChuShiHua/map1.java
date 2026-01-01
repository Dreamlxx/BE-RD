package ChuShiHua;

import java.util.Iterator;
import java.util.Map;
import  java.util.HashMap;
import java.util.Set;
import java.util.function.BiConsumer;

//目的：通过键找值。

public class map1 {
    public static void main(String[] args){
        Map<String,String> map=new HashMap<>();
        map.put("胡馨玥","傻逼");
        map.put("李响","猪");
        map.put("贺明浩","毛毛");

        //通过键找值。
        Set<String>  keys = map.keySet();//传出所有的key到一个set的数组；
        for (String key : keys) {
            System.out.println(keys);
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("1");
        //lambda的最复杂形式。
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+"="+value);
            }
        });

        System.out.println("2");
        map.forEach((String key,String value)->{
            System.out.println(key+"="+value);
        });

        System.out.println("3");
        //“->”后的语句只有一个，所以可以省略大括号
        map.forEach((key,value)-> System.out.println(key+"="+value));

        System.out.println("迭代器遍历");
        Iterator<String> s = keys.iterator();
        while (s.hasNext()){
            /* System.out.println(s.next()+"="+map.get(s.next()));
            * 这样会在一句话使用两次next，是错误的*/
            String keyk=s.next();
            System.out.println(keyk+"="+map.get(keyk));
        }
    }
}

