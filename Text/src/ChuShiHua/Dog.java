package ChuShiHua;

// Dog类示例，展示不同类型的变量
public class Dog {
    // 1. 类变量（静态变量） - 声明为static类型
    // 在所有实例间共享，属于类本身而不是任何特定对象
    private static int dogCount = 0;  // 统计创建的Dog对象数量

    // 2. 成员变量（实例变量） - 定义在类中，方法体之外
    // 每个对象实例都有自己的副本
    private String name;    // 狗狗的名字
    private int age;        // 狗狗的年龄
    private String breed;   // 狗狗的品种

    // 构造方法
    public Dog(String name, int age, String breed) {
        // 初始化成员变量
        this.name = name;
        this.age = age;
        this.breed = breed;

        // 每创建一个Dog对象，类变量dogCount加1
        dogCount++;
        System.out.println("创建了一只新狗狗，当前狗狗总数: " + dogCount);
    }

    // eat() 方法
    public void eat(String food) {
        // 3. 局部变量 - 在方法内部声明和初始化
        // 仅在方法执行期间存在，方法结束后自动销毁
        int mealSize = 250;  // 每次吃的食物量（克）
        String mealTime = "中午";  // 吃饭时间

        System.out.println(name + "正在吃" + mealTime + "餐，吃了" + mealSize + "克" + food);
        System.out.println("mealSize和mealTime是局部变量，只在eat()方法内有效");

        // 可以访问成员变量
        System.out.println(name + "今年" + age + "岁，吃得很开心！");
    }

    // run() 方法
    public void run(int distance) {
        // 局部变量 - 在方法内部声明
        double caloriesBurned = distance * 0.5;  // 计算消耗的卡路里

        System.out.println(name + "跑了" + distance + "米，消耗了" + caloriesBurned + "卡路里");
        System.out.println("caloriesBurned是局部变量，run()方法结束后会被销毁");

        // 局部变量只能在声明它的方法内使用
        // 下面这行代码如果取消注释会报错，因为mealSize在eat()方法中定义
        // System.out.println(mealSize); // 编译错误！
    }

    // sleep() 方法
    public void sleep() {
        // 局部变量 - 方法内定义
        int sleepHours = 8;
        String sleepPosition = "侧卧";

        System.out.println(name + "以" + sleepPosition + "姿势睡了" + sleepHours + "小时");
        System.out.println("sleepHours和sleepPosition是局部变量");

        // 可以访问类变量
        System.out.println("现在总共有" + dogCount + "只狗狗");
    }

    // name() 方法 - 返回狗狗名字
    public String getName() {
        return name;  // 返回成员变量
    }

    // 静态方法 - 访问类变量
    public static int getDogCount() {
        // 静态方法可以访问类变量，但不能直接访问非静态成员变量
        // System.out.println(name); // 这行会报错，不能访问非静态变量

        return dogCount;
    }

    // 显示狗狗信息的方法
    public void displayInfo() {
        System.out.println("=== 狗狗信息 ===");
        System.out.println("名字: " + name);      // 访问成员变量
        System.out.println("年龄: " + age + "岁"); // 访问成员变量
        System.out.println("品种: " + breed);     // 访问成员变量
        System.out.println("总狗狗数: " + dogCount); // 访问类变量
    }

    // 主方法，用于测试
    public static void main(String[] args) {
        System.out.println("=== 开始Dog类示例 ===");

        // 创建Dog对象，调用构造方法
        Dog dog1 = new Dog("旺财", 3, "金毛");
        Dog dog2 = new Dog("小白", 2, "泰迪");

        System.out.println("\n=== 调用对象方法 ===");

        // 调用dog1的方法
        System.out.println("\n--- " + dog1.getName() + "的活动 ---");
        dog1.eat("狗粮");      // 调用eat()方法
        dog1.run(100);         // 调用run()方法
        dog1.sleep();          // 调用sleep()方法
        dog1.displayInfo();    // 调用displayInfo()方法

        // 调用dog2的方法
        System.out.println("\n--- " + dog2.getName() + "的活动 ---");
        dog2.eat("鸡肉");      // 调用eat()方法
        dog2.run(50);          // 调用run()方法
        dog2.sleep();          // 调用sleep()方法
        dog2.displayInfo();    // 调用displayInfo()方法

        // 通过类名直接访问类变量和静态方法
        System.out.println("\n=== 通过类名访问类变量 ===");
        System.out.println("狗狗总数（通过类名）: " + Dog.getDogCount());

        // 通过对象也可以访问类变量（但不推荐，应该通过类名访问）
        System.out.println("狗狗总数（通过对象）: " + dog1.getDogCount());

        System.out.println("\n=== 变量生命周期演示 ===");
        System.out.println("1. 类变量(dogCount): 从类加载开始存在，到程序结束");
        System.out.println("2. 成员变量(name, age, breed): 从对象创建开始存在，到对象被垃圾回收");
        System.out.println("3. 局部变量(mealSize, caloriesBurned等): 从方法调用开始存在，到方法结束");
    }
}
