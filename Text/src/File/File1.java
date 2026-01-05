package File;

import java.io.File;

public class File1 {
    public static void main(String[] args) {

        //1.根据字符串表示的路径，变成File对象
        String str="C:\\Users\\Dream\\Desktop\\a.txt";
        File f1=new File(str);
        System.out.println(str);

        //2.父路径
        String parent="C:\\Users\\Dream\\Desktop";
        String child="a.txt";
        File f2=new File(parent,child);
        System.out.println(f2);

        //3.把一个File表示的路径和字符串表示路径进行拼接。
        File parent2=new File("C:\\Users\\Dream\\Desktop");
        String child2="a.txt";
        File f3=new File(parent2,child2);
        System.out.println(f3);

    }
}
