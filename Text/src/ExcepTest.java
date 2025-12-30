public class ExcepTest{
//异常处理,异常发生try中文件被保护
    public static void main(String args[]){
        try{
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        }catch(ArrayIndexOutOfBoundsException e){//e的类型是个专门数组超出的类型名称。
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("Out of the block");
    }
}