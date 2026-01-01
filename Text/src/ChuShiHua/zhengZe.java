package ChuShiHua;//正则表达式教学

import java.util.regex.*;

class zhengZe{
    public static void main(String[] args){
        String content = "I am noob " +
                "from runoob.com." + "LXNB";

        String pattern = ".*LXNB.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'LXNB' 子字符串? " + isMatch);
    }
}
