package YiChang;

/*
jvm默认处理异常的方式：
        1.把异常的名称，异常原因及异常现象输出到了控制台
        2.程序停止执行，异常下面的代码就不会执行
 */

public class YiChang2 {
    public static void main(String[] args) {
        System.out.println("sss");
        System.out.println(2/0);
        System.out.println("ssdd");

    }
}
