package IO;

import java.io.FileReader;
import java.io.IOException;

public class IO_7 {
    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("src\\c.txt");

        int cnt;
        while((cnt=reader.read())!= -1){
            System.out.print((char)cnt);
        }
        reader.close();
    }
}
