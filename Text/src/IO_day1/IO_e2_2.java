package IO_day1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_e2_2 {
    public static void main(String[] args) throws IOException {
        FileInputStream file1=new FileInputStream("src\\falesWife");
        FileOutputStream file2 =new FileOutputStream("src\\falesWife(ture).jpg");

        //加密处理
        int b;
        while((b=file1.read())!=-1){
            file2.write(b^2);
        }
        file2.close();
        file1.close();
    }
}
