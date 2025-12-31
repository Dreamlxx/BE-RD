public class ExcepTest{
//异常处理,异常发生try中文件被保护
    public static void main(String args[]){
        int a[] = new int[2];
        a[1]=1;
        try{
            System.out.println("Access element three :" + a[3]);//这里故意给了一个错误的情况，会进入catch
        }catch(ArrayIndexOutOfBoundsException e){//e的类型是个数组超出的异常处理类型名称。
            System.out.println("Exception thrown  :" + e);
        }
        //无论如何都会执行
        finally{
            a[0] = 6;
            System.out.println("First element value: " +a[0]);
            System.out.println("The finally statement is executed");
        }
        System.out.println("li xang");
    }
}