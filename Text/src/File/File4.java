package File;

import java.io.File;

public class File4 {
    public static void main(String[] args) {
        File file=new File("D:\\SakuraCat\\locales");
        File[] files=file.listFiles();
        long sum=0;
        for (File file1 : files) {
            System.out.println(file1);
            long length = file.length();
            sum+=length;
        }
        System.out.println("这个文件夹里的文件大小一共是："+sum);
    }
}
