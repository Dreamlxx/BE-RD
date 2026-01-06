package IO;

//FileWriter

import java.io.FileWriter;
import java.io.IOException;

public class IO_9 {
    public static void main(String[] args) throws IOException {
        FileWriter w=new FileWriter("src\\d.txt",true);

        //1.一个一个输入
        w.write(97);

        String x="\r\n";
        w.write(x);

        //2.字符串输入
        String yw="余威是她妈的傻逼";
        w.write(yw);

        w.close();
    }
}
