package File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class File3 {
    /*
    public long length()                返回文件的大小（字节数量）
    public String getAbsolutePath()     返回文件的绝对路径
    public String getPath()             返回定义文件时使用的路径
    public String getName()             返回文件的名称，带后缀
    public long lastModified()          返回文件的最后修改时间（时间毫秒值）
     */

    public static void main(String[] args) {
        File f1=new File("C:\\Users\\Dream\\Desktop\\（202421091081）（李响）（张宇）\\（003）（课程设计报告）（202421091081）（李响）.doc");

        long length = f1.length();
        System.out.println(length);
        System.out.println("=============================");

        long l = f1.lastModified();
        System.out.println(l);

        //将毫秒值化为时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = sdf.format(l);
        System.out.println("最后修改时间：" + formattedDate);
    }
}
