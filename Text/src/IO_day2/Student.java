package IO_day2;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable

    /*
    Serialzable接口里没有抽象方法，是一个标记型接口

    一旦实现了这个接口，就表明这个类可以被序列化
     */

{
    @Serial
    private static final long serialVersionUID = 1303596615904910856L;
    //加了这个可以在序列化之后更改学生类
    

    private String name;
    private  int age;
    /*
    transient:瞬态关键字
    作用是不会把当前属性序列化到本地文件中
     */
    private  transient String address;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
