package ChuShiHua;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//下列map集合都是一旦创立就无法修改。
public class UnchangableMap {
    public static void main(String[] args){

        //不可变的map集合这样传入的键值对不能超过10对，也就是20个参数。
        Map<String, String> map = Map.of("li", "xiang", "hu", "xin");

        //问题2，如果要传入map的不可变集合，这时候需要使用：
        HashMap<String,String> hm=new HashMap<>();
        hm.put("1","a12");
        hm.put("12","a122");
        hm.put("13","a112");
        hm.put("14","a412");
        hm.put("15","a431");
        hm.put("16","a1234");
        hm.put("17","a2434");
        hm.put("18","a546");
        hm.put("19","a12145");
        hm.put("100","a12345");
        hm.put("134","a12131324");

        //获取到所有的键值对对象
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        //把entries变成一个数组。
        /*
        Map.Entry[] arr = entries.toArray(new Map.Entry[0]);

        这一段代码可以变为下面这些代码*/

        Map.Entry[] arr=new Map.Entry[0];//创建一个数组
        Map.Entry[] arr1 = entries.toArray(arr);
        /*
        toArray在底层会比较集合长度与数组的长度，小了自动扩大，大了就不作变动
         */
        Map map1 = Map.ofEntries(arr1);//这就是不可变的map集合

        Map<String, String> stringStringMap = Map.copyOf(hm);//从adk10以后自带的，集大成者。

    }

    //问题1:为什么没有使用可变参数的map.of方法
    //下面的代码就是解释：
    //如果想有一个不变的，键和值都应该传入可变参数,且不知道键和值的类型，故使用泛型<K,V>
    /*public static<K,V>  void  of(K...keys,V...values){
        //因为可变参数不能是最后一个形参，所以这样不行。
    }
     */
}
