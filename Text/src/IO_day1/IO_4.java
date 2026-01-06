package IO_day1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_4 {
    public static void main(String[] args) throws IOException {
        /*
            读取文件加写入合体，名为“拷贝”
         */

        //1.初始化
        FileOutputStream out=new FileOutputStream("src\\b.txt");
        FileInputStream in=new FileInputStream("src\\a.txt");

        long start=System.currentTimeMillis();

        //2.写入
        int b=0;
        while((b=in.read())!=-1){
            out.write(b);
        }



        //3.关闭，先创建的后关上
        in.close();
        out.close();

        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
