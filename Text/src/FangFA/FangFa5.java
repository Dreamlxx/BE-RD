//类名引用成员方法
/*
    其有独立规则：
        1.需要有函数式接口
        2.被引用的方法必须已经存在
        3.被引用方法的形参，需要跟抽象方法的第二个形参到最后一个形参保持一致，返回值需要保持一致
        4.被引用方法的功能需要满足当前的需求

抽象方法形参的详解：
第一个参数：表示被引用方法的调用者，决定了可以引用哪些类中的方法
在Stream流当中，第一个参数一般都表示流里面的每一个数据。
假设流里面的数据是字符串，那么使用这种方式进行方法引用，只能引用String这个类中的方法

第二个参数到最后一个参数：跟被引用方法的形参保持一致，如果没有第二个参数，说明被引用的方法需要是无参的成员方法

 */


// 格式：
//          类名：：成员方法

package FangFA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;


public class FangFa5 {
    /*
    需求：
            集合里面一些字符串，要求变成大写后进行输出
     */
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"a","b","c","d");

        //2.转化大写第一种方式
        list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();//这个方法就是把大写转为小写
            }
        })
                .forEach(s-> System.out.println(s));

        //3.转换大写第二种方式
        list.stream().map(String::toUpperCase)
                .forEach(s-> System.out.println(s));
    }
}
