public class ZiFu {
    public static  void main(String[] args){
        StringBuilder sb = new StringBuilder(10);

        //放入字符串
        sb.append("LXNB..");

        //插入字符
        sb.insert(2,'!');

        //删除
        sb.delete(0,2);

        System.out.println(sb);

        //反转
        sb.reverse();

        System.out.println(sb);
    }
}
