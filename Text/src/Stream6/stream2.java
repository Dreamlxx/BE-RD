package Stream6;

import java.util.*;
import java.util.stream.Stream;

public class stream2 {
    public static void main(String[] args){
        //1.单列集合使用collection中的默认方法
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"1","2","3","4");
        list.stream().forEach(s->System.out.print(s));

        System.out.println("=========================");

        //2.双列集合
        HashMap<String,String>hm=new HashMap<>();
        hm.put("1","a");
        hm.put("2","aa");
        hm.put("3","aaa");
        hm.put("4","aaaa");

        Set<String> s1 = hm.keySet();
        s1.stream().forEach(s-> System.out.println(s));

        Set<Map.Entry<String, String>> e1 = hm.entrySet();
        e1.stream().forEach(s-> System.out.println(s));

        System.out.println("=========================");

        //3.数组
        int []arr={1,2,3,4,5,};
        Arrays.stream(arr).forEach(s-> System.out.println(s));

        System.out.println("=========================");

        //4.零散数据
        Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));
    }
}
