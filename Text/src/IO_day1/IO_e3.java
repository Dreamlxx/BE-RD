package IO_day1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class IO_e3 {
    public static void main(String[] args) throws IOException {
        FileReader r=new FileReader("src\\e.txt");
        StringBuilder s=new StringBuilder();
        int ch;
        while((ch=r.read())!=-1){
            s.append((char) ch);
        }
        r.close();
        System.out.println(s);

        //排序1
        String string = s.toString();
        String[] split = string.split("-");
        ArrayList<Integer> list=new ArrayList<>();
        for (String s1 : split) {
            int i = Integer.parseInt(s1);
            list.add(i);
        }
        Collections.sort(list);

        //输出1
        FileWriter writer=new FileWriter("src\\e.txt");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                writer.write(list.get(i)+" ");
            }else writer.write(list.get(i)+"-");
        }
        writer.close();


        //排序2
        Integer[] array = Arrays.stream(s.toString().split("-"))
                .map(Integer::parseInt)
                .sorted(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return 0;
                    }
                })
                .toArray(Integer[]::new);


        //输出2
        String replace = Arrays.toString(array).replace(",", "-");
        String r1=replace.substring(1,replace.length()-1);
        writer.write(r1);
        writer.close();

    }
}
