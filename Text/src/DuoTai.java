public class DuoTai {
    public static void main(String[] args) {
        // 第1行：调用show方法，传入Cat对象
        // 由于Cat是Animal的子类，这里会发生向上转型
        show(new Cat());
        // 执行过程：
        // 1. new Cat() 创建Cat对象
        // 2. 传递给show方法，参数类型Animal接收Cat对象
        // 3. 进入show方法执行

        // 第2行：调用show方法，传入Dog对象
        show(new Dogg());
        // 执行过程类似上面，传入Dog对象

        // 第3行：创建Cat对象，赋值给Animal类型引用
        // 向上转型：子类对象赋给父类引用
        Animal a = new Cat();
        // a的编译时类型是Animal，运行时类型是Cat

        // 第4行：通过父类引用调用eat方法
        a.eat();
        // 这里发生动态绑定（多态）：
        // 1. 编译时检查Animal类是否有eat方法 ✅
        // 2. 运行时实际调用的是Cat类的eat方法

        // 第5行：向下转型，将Animal引用强制转换为Cat类型
        Cat c = (Cat)a;
        // 这是安全的向下转型，因为a实际指向Cat对象
        // 转换后，c具有Cat类型的全部访问权限

        // 第6行：通过Cat引用调用work方法
        c.work();
        // 调用Cat类特有的work方法
    }

    public static void show(Animal a) {
        // 第7行：通过Animal引用调用eat方法
        a.eat();
        // 多态调用：根据传入的实际对象类型决定调用哪个eat方法

        // 第8行：类型判断
        if (a instanceof Cat) {  // 检查a是否指向Cat对象
            // 第9行：向下转型为Cat
            Cat c = (Cat)a;
            // 第10行：调用Cat特有的work方法
            c.work();
        } else if (a instanceof Dogg) { // 检查a是否指向Dog对象
            // 第11行：向下转型为Dog
            Dogg c = (Dogg)a;
            // 第12行：调用Dog特有的work方法
            c.work();
        }
    }
}

abstract class Animal {
    // 抽象方法，子类必须实现
    abstract void eat();
}

class Cat extends Animal {
    // 实现父类的抽象方法
    public void eat() {
        System.out.println("吃鱼");
    }
    // Cat特有的方法
    public void work() {
        System.out.println("抓老鼠");
    }
}

class Dogg extends Animal {
    // 实现父类的抽象方法
    public void eat() {
        System.out.println("吃骨头");
    }
    // Dog特有的方法
    public void work() {
        System.out.println("看家");
    }
}
