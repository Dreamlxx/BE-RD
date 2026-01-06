package IO;

import java.io.FileReader;
import java.io.IOException;

public class IO_8 {
    public static void main(String[] args) throws IOException {
        FileReader r=new FileReader("src\\c.txt");

        char []read=new char[2];
        int len;

        //带参read(xxx)把读取数据、解码、转换类型三步合在一起了
        while((len=r.read(read))!=-1){
            System.out.println(new String(read,0,len));
        }
        r.close();
    }
}
