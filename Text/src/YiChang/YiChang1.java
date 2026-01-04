package YiChang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class YiChang1 {
    public static void main(String[] args) throws ParseException {

        //1.编译时期异常（在编译阶段，必须要手动处理，否则代码报错）
        String time="2030年1月1日";
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy年MM月dd日");

        //这里的parse会显示波浪线，添加上面的“throws ParseException”即可。
        Date date=sdf.parse(time);
        System.out.println(date);

        //2.运行时异常（在编译阶段不需要处理，是代码运行时出现的异常）
        int []arr={1,2,3,4};
        //System.out.println(arr[9]);这就是运行时异常
    }
}
