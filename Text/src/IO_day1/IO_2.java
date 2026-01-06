package IO_day1;

import java.io.FileOutputStream;
import java.io.IOException;

public class IO_2 {
    public static void main(String[] args) throws IOException {

        //“name”后面可以传入一个续写开关“ture”，开了就不会覆盖文件中的内容。
        FileOutputStream fileOutputStream = new FileOutputStream("src\\a.txt",true);

        //1.初始化一个内容
        String s="lixiangzhenshuai";
        byte[] bytes = s.getBytes();
        fileOutputStream.write(bytes);


        //2.换行输入
        String r="\r\n";
        byte[] bytes1 = r.getBytes();
        fileOutputStream.write(bytes1);

        //3.再输入
        String s1="lixiangzhenshuai";
        byte[] bytes2 = s.getBytes();
        fileOutputStream.write(bytes2);

        fileOutputStream.close();
    }
}

