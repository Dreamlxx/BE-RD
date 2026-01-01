package ChuShiHua;/*public class ChuShiHua.MeiJu {
    enum X{a,b,c}
    public static void main(String[] args){
        X p=X.a;
        System.out.println(p);

        //java增强型for循环，for（变量名：集合或者数组）
        for(X value:X.values()){
            System.out.print(value);
        }
    }
}*/



//class要小写。
class Size{
    enum Sizelist{_1,_2,_3}
    Sizelist S;
        }

public class MeiJu{
    public static void main(String[] args) {
        Size p = new Size();
        p.S = Size.Sizelist._1;
        System.out.println(p.S);
    }
}