package IO_day2;

//转换流
/*
转换流按照指定的字符编码读取
 */


import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class d2_2 {
    public static void main(String[] args) throws IOException {
        FileReader fd=new FileReader("src\\d.txt", Charset.forName("GBK"));
        int ch;
        while((ch=fd.read())!=-1){
            System.out.print((char) ch);
        }

        fd.close();
    }
}
