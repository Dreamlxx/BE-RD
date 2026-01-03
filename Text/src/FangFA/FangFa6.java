//方法引用（数组的构造方法）
/*
格式：   数据类型[]::new
目的：创建一个指定类型的数组
需求：集合中存储一些整数，收集到数组当中
 */

package FangFA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class FangFa6 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        ArrayList<Integer>list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4);

        //2.收集到数组当中
        Integer[] array = list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
        System.out.println(Arrays.toString(array));

        System.out.println("===============================");


        //3.简化
        Integer[] array1 = list.stream().toArray(Integer[]::new);//注意这里是Integer。
        System.out.println(Arrays.toString(array1));
    }
}
