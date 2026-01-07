package IO_day2;

/*
序列化流，隶属于字节流
反序列化流（对象操作输入流）
 */

import java.io.*;

public class d2_4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student=new Student("zhangsan",23);

        //创建序列化流的对象/对象操作输出流
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src\\b.txt"));

        oos.writeObject(student);

        oos.close();


        //反序列化
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src\\b.txt"));

        Student o =(Student) ois.readObject();

        System.out.println(o);

        ois.close();
    }
}
