package IO_day2;

/*
打印流只能读，不能写.
PrintStream字节打印流；
PrintWriter字符打印流。

特点：
        1.打印流只操作文件目的地，不操作数据源
        2.特有的写出方法可以实现，数据原样写出
        3.特有的写出方法，可以实现自动刷新、自动换行
 */


import java.io.*;
import java.nio.charset.Charset;

public class d2_5 {
    public static void main(String[] args) throws IOException {
        PrintStream ps=new PrintStream(new FileOutputStream("src\\b.txt"),true, Charset.forName("UTF-8"));

        ps.println(97);
        ps.print(true);
        ps.printf("adsda");

        ps.close();


        System.out.println("===========================================");


        PrintWriter pw=new PrintWriter(new FileWriter("src//b.txt"));

        pw.println("你好你好");

        pw.close();



    }
}
