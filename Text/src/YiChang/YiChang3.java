package YiChang;

/*
自己处理（捕获异常）：
        目的：当异常出现代码可以继续执行
 */

public class YiChang3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
//            String message = e.getMessage();
//            String string = e.toString();
//            System.out.println(string);

            e.printStackTrace();//用的最多，仅仅用红色打印错误信息，不会停止代码运行
        }
    }
}
