package IO_day1;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class IO_6 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //1.编码
        String str="贺明浩是个13";
        byte[]bytes=str.getBytes();
        System.out.println(Arrays.toString(bytes));

        byte[]bytes1=str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

        //2.解码
        String str1=new String(bytes);
        System.out.println(str1);

        String str2=new String(bytes,"GBK");
        System.out.println(str2);
    }
}
