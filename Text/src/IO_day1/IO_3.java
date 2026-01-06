package IO_day1;

import java.io.FileInputStream;
import java.io.IOException;

public class IO_3 {
    public static void main(String[] args) throws IOException {
        FileInputStream in=new FileInputStream("src\\a.txt");

        //1.一个一个读取
        int read1 = in.read();
        int read2 = in.read();
        int read3 = in.read();
        int read4 = in.read();

        System.out.println((char)read1);
        System.out.println((char)read2);
        System.out.println((char)read3);
        System.out.println((char)read4);


        System.out.println("===========================================");

        //2.循环读取
        int b;
        while((b=in.read())!=-1){//必须用b接住。
            System.out.print((char) b);//read是读取一个数据就移动一个指针。
        }//这个和迭代器很像，next（）移动到下一个元素，并记录返回。

        //3.关闭
        in.close();
    }
}
