package FangFA;

public class Student {
    private String name;
    private  int age;

    public Student(String name,Integer age) {
        this.name=name;
        this.age=age;
    }

    public Student() {
    }

    //加工一个new
    public Student(String str){
        this.name=str.split(",")[0];
        this.age =Integer.parseInt(str.split(",")[1]);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

