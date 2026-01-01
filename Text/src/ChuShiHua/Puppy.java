package ChuShiHua;

public class Puppy {
    private int age;
    private String name;

    public  Puppy(){

    }

    // 构造器
    public Puppy(String name,int age) {
        this.name = name;
        this.age=age;
        System.out.println("小狗的名字是 : " + name);
        System.out.println("小狗的年龄是 : " + age);
    }

    // 设置 age 的值
    public void setAge(int age) {
        this.age = age;
    }

    // 获取 age 的值
    public int getAge() {
        return age;
    }

    // 获取 name 的值
    public String getName() {
        return name;
    }

    public class woman extends Puppy{
        public woman(String name,int age){
            super(name,age);
        }

        //重构
        @Override
        public int getAge() {
            return super.getAge();
        }
    }


    // 主方法
    public static void main(String[] args) {
        // 创建对象
        Puppy myPuppy = new Puppy("Tommy",36);

        // 通过方法来设定 age
        myPuppy.setAge(2);

        // 调用另一个方法获取 age
        int age = myPuppy.getAge();
        System.out.println("小狗的年龄为 : " + age);

        // 也可以直接访问成员变量（通过 getter 方法）
        System.out.println("变量值 : " + myPuppy.getAge());
    }
}
