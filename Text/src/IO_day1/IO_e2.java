package IO_day1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//对文件进行加密或者解密
//采用异或的运算（^）
//异或两次得到本身
public class IO_e2 {
    public static void main(String[] args) throws IOException {
        FileInputStream file1=new FileInputStream("src\\wife.jpg");
        FileOutputStream file2 =new FileOutputStream("src\\falesWife");

        //加密处理
        int b;
        while((b=file1.read())!=-1){
            file2.write(b^2);
        }
        file2.close();
        file1.close();
    }
}
