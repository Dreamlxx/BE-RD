package FangFA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FangFa1 {
    public static void main(String[] args){

        //需求：将一个数组里面的元素倒序排列
        Integer[]arr={4,2,5,7,1,3};

        //匿名内部类
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr));

        //lambda表达式简化
        //因为第二个参数的类型Comparator是一个函数式接口，所以可以用lambda简化。
        Arrays.sort(arr,( o1,  o2)->o2-o1);
        System.out.println(Arrays.toString(arr));


        //方法引用
        /* 要求：
        1.被引用的方法已经存在
        2.被引用方法的形参和返回值和需要跟抽象方法的形参跟返回值保持一样
        3.引用处需要是函数式接口
        4.被引用方法的功能需要满足当前的需求
         */

        Arrays.sort(arr,FangFa1::sort);//这个"::"就是方法引用符号
        System.out.println(Arrays.toString(arr));

    }

    public static int sort(Integer o1,Integer o2){
        return o2-o1;
    }
}
