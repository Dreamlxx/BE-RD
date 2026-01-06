package IO_day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_e1 {
    /*
    需求：
        拷贝一个文件夹，考虑其子文件夹
     */
    public static void main(String[] args) throws IOException {
        //1.创建对象表示数据源
        File src=new File("C:\\JAVA_B\\Text\\src\\IO");

        //2,创捷对象表示目的地
        File end=new File("C:\\JAVA_B\\Text\\copyIO");

        //3.调用方法开始拷贝
        copyKakaxi(src,end);
    }

    public static void copyKakaxi(File a,File b) throws IOException {
        b.mkdirs();//如果b不存在，就创建出来；如果存在也不会报错

    //考虑到有文件夹的情况，所以需要递归
        File[] files = a.listFiles();

        for (File file : files) {
            if(file.isFile()){
                FileInputStream a1=new FileInputStream(file);
                FileOutputStream b1=new FileOutputStream(new File(b,file.getName()));//创建一个新文件在此文件夹下

                byte[]bytes=new byte[1024];
                int len;

                while((len=a1.read(bytes))!=-1){
                    b1.write(bytes,0,len);
                }
                b1.close();
                a1.close();
            }else {
                copyKakaxi(file,new File(b,file.getName()));
            }
        }
    }


}
