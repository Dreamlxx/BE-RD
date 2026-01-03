//如何引用静态方法

package FangFA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;


public class FangFa2 {
    public static void main(String[]args){
        /*
        需求：
                集合（字符串）中有以下数字，要求把他们都变成int类型
                4，3，2，6，7，8
         */
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"4","3","2","6","7","8");

        //常规方法
        ArrayList<Integer>list1=new ArrayList<>();
        for (String s : list) {
            int i = Integer.parseInt(s);
            list1.add(i);
        }
        System.out.println(list1);

        System.out.println("+++++++++++++++++++++++++++++++++++++");


        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        })
                .forEach(s-> System.out.println(s));

        System.out.println("=============================================");

        list.stream().map(FangFa2::myturn).forEach(s->System.out.println(s));

        System.out.println("=============================================");

        list.stream().map(Integer::parseInt).forEach(s->System.out.println(s));

    }

    public static Integer myturn(String s){
        return Integer.parseInt(s);
    }
}
