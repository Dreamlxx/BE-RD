package YiChang_HomeWork;

public class Girlfriend {
    private String name;
    private int age;

    public Girlfriend() {
    }

    public Girlfriend(String name, Integer age) {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>40||age<18){
            throw new AgeOutLoveExcetion(age+"你不是贺明浩所爱");
        }
        this.age = age;
    }

    public void setName(String name) {
        int length = name.length();
        if (length>10||length<3){
            throw new NameFormatExcetion(name+"贺明浩不喜欢你");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girlfriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
