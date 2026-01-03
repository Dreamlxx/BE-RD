package Stream6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class Stream1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("clic-1");
        list.add("cli-2");
        list.add("clxi-3");
        list.add("zli-4");
        list.add("lixiang-5");
        list.add("lixiang-5");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("clic");
        list1.add("cli");
        list1.add("clxi");
        list1.add("zli");
        list1.add("lixiang");
        list1.add("lixiang");


        //注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
        //注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据。

        list.stream()
                .filter(name->name.startsWith("c"))
                .filter(name->name.length()==4)
                .forEach(name-> System.out.println(name));

        System.out.println("===========================================");

        list.stream()
                .limit(2)//选取前n个元素.
                .forEach(s-> System.out.println(s));

        System.out.println("====================================");

        list.stream()
                .skip(2)//跳过前n个元素.
                .forEach(s-> System.out.println(s));


        list.stream()
                .distinct()//对集合或者数组内元素去重。
                .forEach(s-> System.out.println(s));

        //合并两个数组或者集合
        Stream.concat(list.stream(),list1.stream())
                .forEach(s-> System.out.println(s));

        //如何将数组或者集合中的元素整体换一个类型：利用stream流的map方法。
        list.stream()
                .map(s->Integer.parseInt(s.split("-")[1]))
                .forEach(s-> System.out.println(s));


        //终结方法
        long count = list.stream()
                .count();//元素个数
        System.out.println(count);

        String[] array = list.stream()//toArray底层是创建一个数组，并把每个元素放进数组之中。
                .toArray(value -> new String[value]);

        System.out.println(Arrays.toString(array));

        list.stream()
                .toArray(new IntFunction<String[]>() {
                    @Override
                    public String[] apply(int value) {
                        return new String[value];
                    }
                });
    }

}