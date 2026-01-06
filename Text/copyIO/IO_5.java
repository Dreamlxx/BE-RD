package IO_day1;

import java.io.FileInputStream;
import java.io.IOException;

public class IO_5 {
    public static void main(String[] args) throws IOException {
        FileInputStream in=new FileInputStream("src\\b.txt");
        byte []bytes=new byte[5];//这里可以定义每次读取的数据个数

        int len1=in.read(bytes);
        System.out.println(len1);
        String s1=new String(bytes,0,len1);//如果不用这个，最后若是读取一个数据，则只会覆盖一个，剩下那个数据不会被覆盖
        System.out.println(s1);

        int len12=in.read(bytes);
        System.out.println(len12);
        String s12=new String(bytes,0,len12);
        System.out.println(s12);

        int len123=in.read(bytes);
        System.out.println(len123);
        String s123=new String(bytes,0,len123);
        System.out.println(s123);

        int len1234=in.read(bytes);
        System.out.println(len1234);
        String s1234=new String(bytes,0,len1234);
        System.out.println(s1234);

        in.close();
    }
}
