package Stream6;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class steam3 {
    public static  void main(String[] args){
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"lx-b-11","hxy-g-12","fcq-b-31","cxy-g-332");

        //LIST
        List<String> newlist = list.stream().filter(s -> "b".equals(s.split("-")[1]))
                .collect(Collectors.toList());

        System.out.println(newlist);

        //SET
        Set<String> newSet = list.stream().filter(s -> "b".equals(s.split("-")[1]))
                .collect(Collectors.toSet());

        System.out.println(newSet);

        //MAP,注意键一定不能重复

        //Function里面前一位是流里面的数据类型，后一位是MAp中键或者值的类型
        Map<String, Integer> map = list.stream()
                /*

//toMap  参数一表示的是键生成规则
            参数二是表示值的生成规则

                */
                .filter(s -> "b".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));
        System.out.println(map);

        Map<String, Integer> map1 = list.stream().filter(s -> "b".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0]
                        ,
                        s -> Integer.parseInt(s.split("-")[2])
                ));
        System.out.println(map1);

    }
}
