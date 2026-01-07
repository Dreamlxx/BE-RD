package IO_day2;

/*
按照指定方法写出
 */

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class d2_3 {
    public static void main(String[] args) throws IOException {
//        OutputStreamWriter ow=new OutputStreamWriter(new FileOutputStream("src\\a.txt"),"GBK");
//
//        ow.write("你好你好");
//
//        ow.close();

        FileWriter w=new FileWriter("src\\a.txt", Charset.forName("GBK"));

        w.write("i你好");

        w.close();

    }
}
