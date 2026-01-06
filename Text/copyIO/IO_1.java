package IO_day1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_1 {
    /*
    字节输出流：FileOutputStream
    实现需求：写出一段文字保存到本地文件。

    实现步骤：
        创建对象
        写出数据
        释放资源

     */
    public static void main(String[] args) throws IOException {


        //1.创建对象
        //输出流 OutputStream

        FileOutputStream fos = new FileOutputStream("src\\a.txt");

        //2.写出数据
        fos.write(97);
        fos.write(98);

        byte []b={97,98,99,100};
        fos.write(b);

        //一次写一个字节数组的一部分数据

        fos.write(b,98,2);//off是起始位置，len是输入长度

        //3.释放资源
        fos.close();

    }
}
