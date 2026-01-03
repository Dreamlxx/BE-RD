//如何引用成员方法


package FangFA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class FangFa3 {
    /*
    格式
            其他类：其他类对象::方法名
            本类：this::方法名
            父类：super::方法名



    需求
            集合中有一些名字，按照要求过滤数据
            数据："张无忌"，"周芷若","赵敏","张强","张三丰"
            要求：只要以张开头，且名字是三个字的元素

     */
    public static void main(String[] args){
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");

        //1.
        list.stream().filter(s->s.startsWith("张"))
                .filter(s->s.length()==3)
                .forEach(s-> System.out.print(s));

        System.out.println();
        //2.
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张")&&s.length()==3;
            }
        }).forEach(s-> System.out.println(s));


        System.out.println("=======================");

        //3.用外部类
        list.stream().filter(new FF3_use()::myfunc)
                .forEach(s-> System.out.println(s));

        System.out.println("=======================");

        //4.用内部类
        //主函数这里是静态函数，是没有this的
        list.stream().filter(new FangFa3()::myfunc1)
                .forEach(s-> System.out.println(s));
    }

    public boolean myfunc1(String s){
        return s.startsWith("张")&&s.length()==3;
    }
}
