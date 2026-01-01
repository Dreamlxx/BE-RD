package ChuShiHua;

import java.util.ArrayList;
import java.util.Collections;

class Arraylist2{
    ArrayList<Integer> relist=new ArrayList<Integer>();
    Arraylist2(){
        relist.add(4);
        relist.add(2);
        relist.add(3);
        relist.add(1);

    }
    public void show(){
        System.out.println(relist);
        for(Integer x:relist){
            System.out.println(x);
        }
    }

    public void sort(){
        Collections.sort(relist);
        show();
    }
}

public class ArrayList1{
    public static void main(String[] args) {

        ArrayList<String> list =new ArrayList<String>();
        list.add("LXNB");
        list.add("LXNNNBBB");

        System.out.println(list);
        System.out.println(list.get(1));

        //set更改数据。
        list.set(1,"LXZS");
        System.out.println(list.get(1));

        //remove删除数据。
        list.remove(1);
        System.out.println(list);

        System.out.println(list.size());//输出含有的数据量

        list.add("ssd");
        list.add("ass");
        list.add("bss");
        Collections.sort(list);//有序排序

        for(String l:list) {
            System.out.println(l);
        }

        Arraylist2 relist=new Arraylist2();
        relist.show();
        relist.sort();
    }
}

