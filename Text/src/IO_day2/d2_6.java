package IO_day2;

/*
压缩流和解压缩流
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class d2_6 {
    public static void main(String[] args) throws IOException {
        //1.创建一个File表示要解压的压缩包
        File src=new File("src\\YiChang_HomeWork_work.zip");

        //2.创建一个File表示解压的目的地
        File dest=new File("C:\\JAVA_B\\Text\\copyIO");

        //3.调用方法
        unzip(src,dest);
    }


    public static void unzip(File src,File dest) throws IOException {
        //创建一个压缩流用来读取压缩流中的数据
        ZipInputStream zip=new ZipInputStream(new FileInputStream(src));

        //要先获取到压缩包里面每一个Zipentry对象。
        ZipEntry entry;//表示当前在压缩包中的每一个zipentry对象。

        while ((entry=zip.getNextEntry())!=null){
            System.out.println(entry);

            if(entry.isDirectory()){
                //如果是文件夹就创建文件夹
                File file=new File(dest,entry.toString());
                file.mkdir();
            }else{
                FileOutputStream d=new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while((b=zip.read())!=-1){
                    d.write(b);
                }
                d.close();
                zip.closeEntry();
            }
        }
    zip.close();
    }


}
