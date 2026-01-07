package IO_day2;
/*
需求：
        软件前三次运行是免费
        再往后面运行提示收费
 */


import java.io.*;
//自己写的，前面需要继续改进
public class d2_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new FileReader("src\\reader.txt"));
        int cnt=0;

        if(reader == null){
            BufferedWriter bw=new BufferedWriter(new FileWriter("src\\reader.txt") );
            bw.write(0+"");//直接存入字符0，要不然是ASCII码
            bw.close();
            reader.close();
        }else {
            String s = reader.readLine();
            cnt=Integer.parseInt(s);
            reader.close();
        }

        if(cnt<4){
            System.out.println("已经使用"+cnt+"次，还剩下"+(3-cnt)+"次");
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("src\\reader.txt"));
            cnt++;
            bufferedWriter.write(cnt+"");
            bufferedWriter.close();
        }else{
            System.out.println("免费次数已经用完");
        }
    }
}
