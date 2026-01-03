package FangFA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FangFa4 {
    /*
    需求
            集合里面储存姓名和年龄，要求封装成Student对象并收集到List集合中
     */
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"李响,19","付长青,20","谭博硕,20");

        List<Student> newlist = list.stream()
                .map(new Function<String, Student>() {
                    @Override
                    public Student apply(String s) {
                        String name = s.split(",")[0];
                        int age = Integer.parseInt(s.split(",")[1]);
                        return new Student(name, age);
                    }
                }).collect(Collectors.toList());
        System.out.println(newlist);


        System.out.println("==================================");


        //开始简化
        List<Student> list1 = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(list1);
    }

}
