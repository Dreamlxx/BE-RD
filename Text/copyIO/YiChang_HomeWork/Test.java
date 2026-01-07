package YiChang_HomeWork;

import javax.naming.Name;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    /*
    需求：
        键盘录入自己心仪的女朋友姓名和年龄。
        姓名的长度在 3 - 10之间，
        年龄的范围为 18 - 40岁，
        超出这个范围是异常数据不能赋值，需要重新录入，一直录到正确为止。

    提示：
        需要考虑用户在键盘录入时的所有情况。
        比如：录入年龄时超出范围，录入年龄时录入了abc等情况
     */
        Scanner sc=new Scanner(System.in);
        Girlfriend xy=new Girlfriend();

        while (true) {
            try {
                System.out.println("请输入贺明浩心仪的对象名字：");
                String name=sc.nextLine();
                xy.setName(name);

                System.out.println("请输入贺明浩心仪的对象年龄：");
                int age = Integer.parseInt(sc.nextLine());
                xy.setAge(age);

                //如果全部都是对的，跳出循环。
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
//                continue;
            } catch (NameFormatExcetion e) {
                e.printStackTrace();

//                continue;
            }catch (AgeOutLoveExcetion e){
                e.printStackTrace();
            }

        }
        System.out.println(xy);
    }
}
