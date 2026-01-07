package IO_day2;
/*
压缩文件夹来了！！！！
 */
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class d2_8 {
    public static void main(String[] args) throws IOException {
        //1.创建File表示要被压缩的文件夹
        File src=new File("src\\File");
        //2.创建File对象表示压缩包放在哪里
        File destParent=src.getParentFile();//存入src的父级路径，避免把代码写死
        //3.创建File表示压缩包的路径
        File dest=new File(destParent,src.getName()+".zip");//加zip很关键哦.
        //4.创建压缩流关联压缩包
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(dest));
        //5.获取src中的每一个文件，变成Zipentry对象，放入压缩包中
        zip(src,zos, src.getName());
        //6.关闭
        zos.close();
    }
    public static void zip(File src,ZipOutputStream zos,String name) throws IOException {//name表示压缩包内的路径
        //1.进入src文件夹
        File[]files=src.listFiles();
        //2.遍历数组
        for (File file : files) {
            if(file.isFile()){
                //3.判断为文件，变成Zipentry对象，放入到压缩包
                ZipEntry entry=new ZipEntry(name+"\\"+file.getName());
                zos.putNextEntry(entry);
                //读取文件，写进压缩包
                FileInputStream fis=new FileInputStream(file);
                int b;
                while ((b=fis.read())!=-1){
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            }else{
                //判断为文件夹，递归
                zip(file,zos,name+"\\"+file.getName());
            }
        }
    }
}
