package File;

/*
        public boolean isDirectory()  判断此路径名表示的File是否为文件夹
        public boolean isFile()  判断此路径名表示的File是否为文件
        public boolean exists()  判断此路径名表示的File是否存在
 */

import java.io.File;

public class File2 {
    public static void main(String[] args) {
        //1.对一个文件的路径进行判断
        File f1 = new File("C:\\Users\\Dream\\Desktop\\TASKS\\Tasks\\total\\DataSet\\数据结构学习通题目\\PicturE\\屏幕截图 2025-12-27 112907.png");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

        //2.对一个文件夹的路径进行判断
        File f2=new File("C:\\Users\\Dream");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.exists());

        //3.对一个不存在的路径进行判断
        File f3 =new File("E\\ss");
        System.out.println(f3.isDirectory());
        System.out.println(f3.isFile());
        System.out.println(f3.exists());
    }
}
