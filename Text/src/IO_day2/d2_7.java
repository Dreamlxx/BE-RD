package IO_day2;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/*
压缩本质：把每一个”文件/文件夹“当作Zipentry对象放进压缩包中
 */
public class d2_7 {
    public static void main(String[] args) throws IOException {
        /*
        压缩单个文件
         */

        //1.创建对象File表示要压缩的文件
        File src=new File("src\\a.txt");
        //2.创建对象File表示压缩包的位置
        File dest=new File("C:\\JAVA_B\\Text\\copyIO\\");

        //3.
        zip(src,dest);

    }

    public static void zip(File src,File dest) throws IOException {
        //1.创建压缩流文件关联压缩包
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File(dest,"a.zip")));

        //2.创建Zipentry对象，表示压缩包里的每一个文件和文件夹
        ZipEntry entry=new ZipEntry("a.txt");//这里的参数表示压缩包里面的路径


        //3.把Zipentry放进压缩包中
        zos.putNextEntry(entry);//但此时没有数据

        //4.写入数据
        FileInputStream fis=new FileInputStream(src);
        int b;
        while((b= fis.read())!=-1){
            zos.write(b);
        }
        zos.closeEntry();
        zos.close();
    }
}
